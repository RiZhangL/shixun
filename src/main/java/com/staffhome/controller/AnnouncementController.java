package com.staffhome.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.Announcement;
import com.staffhome.pojo.Position;
import com.staffhome.service.AnnouncementMapperService;
import com.staffhome.service.impl.AnnouncementMapperServiceImpl;

@Controller
public class AnnouncementController {
	
	@Autowired
	AnnouncementMapperServiceImpl announcementService;
	
	@RequestMapping("addAnnouncement")
	public ModelAndView addAnnouncement(HttpServletRequest request) {
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String introduction=request.getParameter("introduction");
		java.util.Date utildate=new java.util.Date();
		Date date=new Date(utildate.getTime());
		Announcement announcement=new Announcement();
		announcement.setTitle(title);
		announcement.setContent(content);
		announcement.setTime(date);
		announcement.setIntroduction(introduction);
		announcementService.addAnnoucement(announcement);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/selectAllAnnoucement");
		return mav;
	}
	
	@RequestMapping("selectAllAnnoucement")
	public ModelAndView selectAllAnnoucement() {
		List<Announcement> announcements=announcementService.selectAllAnnoucement();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", announcements);
		mav.addObject("number", announcements.size());
		mav.addObject("minist", announcements.size() == 0 ? 0 : 1);
		mav.setViewName("/announcement/announcements.jsp");
		return mav;
	}
	
	@RequestMapping("updateAnnoucement")
	public ModelAndView  updateAnn(int id) {
		System.out.println("接受id:"+id);
		Announcement announcement=announcementService.selectOneAnnouncement(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("announcement",announcement);
		mav.setViewName("/announcement/showUpdateNotice.jsp");
		return mav;
	}
	
	@RequestMapping("updateAnnouncement2")
	public ModelAndView  updateAnn2(HttpServletRequest request) {
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String introduction=request.getParameter("introduction");
		int id=Integer.parseInt(request.getParameter("id"));
		java.util.Date utildate=new java.util.Date();
		Date date=new Date(utildate.getTime());
		Announcement announcement=new Announcement();
		announcement.setIntroduction(introduction);
		announcement.setId(id);
		announcement.setTitle(title);
		announcement.setContent(content);
		announcement.setTime(date);
		announcementService.updateAnnoucement(announcement);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/selectAllAnnoucement");
		return mav;
	}
	
	@RequestMapping("deleteAnnouncement")
	public ModelAndView deleteAnnoucements(HttpServletRequest request) {
		System.out.println(request.getParameter("deleteIds"));
		String[] idStrings=request.getParameter("deleteIds").split(",");
		List<Integer> deleList=new ArrayList<Integer>();
		for(int i=0;i<idStrings.length;i++) {
			deleList.add(Integer.parseInt(idStrings[i]));
		}
		announcementService.deleteAnnouncements(deleList);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/selectAllAnnoucement");
		return mav;
	}
	
	@RequestMapping("preview")
	public ModelAndView  preview(int id) {
		System.out.println("接受id:"+id);
		Announcement announcement=announcementService.selectOneAnnouncement(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("announcement",announcement);
		mav.setViewName("/announcement/previewAnnouncement.jsp");
		return mav;
	}
	
	@RequestMapping("search")
	@ResponseBody
	public ModelAndView  search(HttpServletRequest request) {
		String queryAttr=request.getParameter("queryAttr");
		String content=request.getParameter("content");
		List<Announcement> announcements;
		ModelAndView mav = new ModelAndView();
		if(content.length()==0) {
			announcements=announcementService.selectAllAnnoucement();
		}else {
			if(queryAttr.equals("title")) {
				content="%"+content+"%";
				announcements=announcementService.selectBytitle(content);
			}else {
				announcements=announcementService.selectByCreator(content);
			}
		}
		mav.addObject("list", announcements);
		mav.addObject("number", announcements.size());
		mav.addObject("minist", announcements.size() == 0 ? 0 : 1);
		mav.setViewName("/announcement/search.jsp");
		return mav;
	}
	
}
