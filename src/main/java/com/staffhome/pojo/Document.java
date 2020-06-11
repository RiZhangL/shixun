package com.staffhome.pojo;

public class Document {
	private int id;
	private String title;
	private String filename;
	private String remark;
	private String create_date;
	private String user_id;
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
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", filename=" + filename + ", remark=" + remark
				+ ", create_date=" + create_date + ", user_id=" + user_id + "]";
	}
	public Document(int id, String title, String filename, String remark, String create_date, String user_id) {
		super();
		this.id = id;
		this.title = title;
		this.filename = filename;
		this.remark = remark;
		this.create_date = create_date;
		this.user_id = user_id;
	}
	public Document(String title, String filename, String remark, String create_date, String user_id) {
		super();
		this.title = title;
		this.filename = filename;
		this.remark = remark;
		this.create_date = create_date;
		this.user_id = user_id;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
