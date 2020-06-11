package com.staffhome.pojo;

import java.sql.Date;

public class Announcement {
	int id;
	String title;
	String introduction;
	Date time;
	String content;
	String creator_name;
	String creator_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreator_name() {
		return creator_name;
	}
	public void setCreator_name(String creator_name) {
		this.creator_name = creator_name;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", introduction=" + introduction + ", time=" + time
				+ ", content=" + content + ", creator_name=" + creator_name + ", creator_id=" + creator_id + "]";
	}
	

}
