package com.staffhome.pojo;

public class SelectEmp {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SelectEmp [id=" + id + ", name=" + name + "]";
	}
	public SelectEmp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SelectEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
