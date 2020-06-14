package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffhome.mapper.AnnouncementMapper;
import com.staffhome.mapper.DepartmentMapper;
import com.staffhome.pojo.Announcement;
import com.staffhome.service.AnnouncementMapperService;

@Service
public class AnnouncementMapperServiceImpl implements AnnouncementMapperService{
	
	@Autowired
	AnnouncementMapper mapper;
	
	public void addAnnoucement(Announcement announcement) {
		// TODO Auto-generated method stub
		mapper.addAnnouncement(announcement);
	}
	
	public List<Announcement> selectAllAnnoucement(){
		return mapper.selectAllAnnouncement();
	}

	public void updateAnnoucement(Announcement announcement) {
		// TODO Auto-generated method stub
		mapper.updateAnnouncementById(announcement);
	}

	public void deleteOneAnnoucement(int id) {
		// TODO Auto-generated method stub
		mapper.deleteOneAnnouncement(id);
	}

	public void deleteAnnouncements(List<Integer> list) {
		// TODO Auto-generated method stub
		mapper.deleteAnnouncements(list);
	}

	public Announcement selectOneAnnouncement(int id) {
		// TODO Auto-generated method stub
		return mapper.selectOneAnnouncement(id);
	}

	@Override
	public List<Announcement> selectBytitle(String title) {
		// TODO Auto-generated method stub
		return mapper.selectBytitle(title);
	}

	@Override
	public List<Announcement> selectByCreator(String creator_name) {
		// TODO Auto-generated method stub
		return mapper.selectByCreator(creator_name);
	}
	

}
