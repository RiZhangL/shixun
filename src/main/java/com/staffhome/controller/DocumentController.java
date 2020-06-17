package com.staffhome.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.Announcement;
import com.staffhome.pojo.Department;
import com.staffhome.pojo.Document;
import com.staffhome.service.impl.DepartmentMapperServiceImlp;
import com.staffhome.service.impl.DocumentMapperServiceImpl;

@Service
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	DocumentMapperServiceImpl service;

	@RequestMapping(value="/addDoc", method=RequestMethod.POST)
	public String addDec(String title, String remark,MultipartFile file, Model model) throws IOException{
		InputStream inputStream = file.getInputStream();
		File saveFile = new File("D:/file/" + file.getOriginalFilename());
		FileOutputStream fosFileOutputStream = new FileOutputStream(saveFile);
		IOUtils.copy(inputStream, fosFileOutputStream);
		inputStream.close();
		fosFileOutputStream.close();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();  
		Date date = calendar.getTime();  
		String dateStringParse = sdf.format(date);  
		Document document = new Document(title, file.getOriginalFilename(), remark, dateStringParse, "1");
		service.addDoc(document);
		return "selectAllDoc";
	}
	
	@RequestMapping(value = "/addDoc_pre")
	public ModelAndView addDoc_pre() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/document/AddDoc.html");
		return mav;
	}

	@RequestMapping("/selectDocument")
	@ResponseBody
	public ModelAndView  search(HttpServletRequest request) {
		String queryAttr=request.getParameter("queryAttr");
		String content=request.getParameter("content");
		List<Document> documents;
		ModelAndView mav = new ModelAndView();
		if(content.length()==0) {
			documents=service.selectAllDoc();
		}else {
			if(queryAttr.equals("title")) {
				content="%"+content+"%";
				documents=service.selectDocument(content);
			}else {
				documents=service.selectDocumentuser(content);
			}
		}
		mav.addObject("list", documents);
		mav.addObject("number", documents.size());
		mav.addObject("minist", documents.size() == 0 ? 0 : 1);
		mav.setViewName("/document/document.jsp");
		return mav;
	}

	@RequestMapping(value = "/selectAllDoc")
	public ModelAndView queryAllDep() {
		List<Document> documents = service.selectAllDoc();
		for (Document c : documents)
			System.out.println(c);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", documents);
		mav.addObject("number", documents.size());
		mav.addObject("minist", documents.size() == 0 ? 0 : 1);
		mav.setViewName("/document/document.jsp");
		return mav;
	}
	
	@RequestMapping("/updateDoc_pre")
	public ModelAndView updateDep_pre(int id, String title, String filename, String remark, String create_date, String user_id) {
		Document document = new Document(id, title, filename, remark, create_date, user_id);
		ModelAndView view = new ModelAndView();
		view.addObject("document", document);
		view.setViewName("/document/UpdateDoc.jsp");
		return view;
	}
	
	@RequestMapping(value="/updateDoc", method=RequestMethod.POST)
	public String updateDoc(int id,String title, String remark,String create_date, String user_id,String filename, Model model) throws IOException{
		Document document = new Document(id, title, filename, remark, create_date, user_id);
		service.updateDoc(document);
		return "selectAllDoc";
	}
	
	@RequestMapping("/deleteDoc")
	public ModelAndView deleteDoc(HttpServletRequest request) {
		System.out.println(request.getParameter("deleteIds"));
		String[] idStrings=request.getParameter("deleteIds").split(",");
		List<Integer> deleList=new ArrayList<Integer>();
		for(int i=0;i<idStrings.length;i++) {
			deleList.add(Integer.parseInt(idStrings[i]));
			String filename = service.selectDocumentid(idStrings[i]).getFilename();
			File file = new File("D:/file/" + filename);// ¶ÁÈ¡
			if(file.isFile()){
				file.delete();
			}
		}
		service.deleteDoc(deleList);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/document/selectAllDoc");
		return mav;
	}
	
	@RequestMapping(value="/downloadDoc",method=RequestMethod.GET)
	public ResponseEntity<byte[]> downloadDoc(int id,String title,String filename, String remark,String create_date, String user_id, HttpServletRequest request) throws IOException{
		String downloadFilePathString = "D:/file/";
		File file = new File(downloadFilePathString + File.separator + filename);
		HttpHeaders headers = new HttpHeaders();
		String downloadFileName = new String(filename.getBytes("UTF-8"), "iso-8859-1");
		headers.setContentDispositionFormData("attachment", downloadFileName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(org.apache.commons.io.FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
}
