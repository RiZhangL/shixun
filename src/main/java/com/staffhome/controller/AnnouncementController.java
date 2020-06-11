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
		java.util.Date utildate=new java.util.Date();
		Date date=new Date(utildate.getTime());
		Announcement announcement=new Announcement();
		announcement.setTitle(title);
		announcement.setContent(content);
		announcement.setTime(date);
		announcementService.addAnnoucement(announcement);
		System.out.println(title);
		System.out.println(content);
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
		int id=Integer.parseInt(request.getParameter("id"));
		java.util.Date utildate=new java.util.Date();
		Date date=new Date(utildate.getTime());
		Announcement announcement=new Announcement();
		announcement.setId(id);
		announcement.setTitle(title);
		announcement.setContent(content);
		announcement.setTime(date);
		announcementService.updateAnnoucement(announcement);
		System.out.println(id);
		System.out.println(title);
		System.out.println(content);
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
	
	
}
