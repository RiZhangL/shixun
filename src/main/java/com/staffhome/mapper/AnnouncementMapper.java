package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.Announcement;

public interface AnnouncementMapper {
	public void addAnnouncement(Announcement announcement);
	
	public List<Announcement>selectAllAnnouncement();
	
	public Announcement selectOneAnnouncement(int id);
	
	public void updateAnnouncementById(Announcement announcement);
	
	public void deleteOneAnnouncement(int id);
	
	public void deleteAnnouncements(List<Integer> list);
	
	public List<Announcement> selectBytitle(String title);
	
	public List<Announcement> selectByCreator(String creator_name);
	
}
