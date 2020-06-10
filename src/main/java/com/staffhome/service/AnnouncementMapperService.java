package com.staffhome.service;

import java.util.List;

import com.staffhome.pojo.Announcement;

public interface AnnouncementMapperService {
	public void addAnnoucement(Announcement announcement);
	public List<Announcement> selectAllAnnoucement();
	public void updateAnnoucement(Announcement announcement);
	public void deleteOneAnnoucement(int id);
	public void deleteAnnouncements(List<Integer> list);
	public Announcement selectOneAnnouncement(int id);
}
