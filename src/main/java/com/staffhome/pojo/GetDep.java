package com.staffhome.pojo;

public class GetDep {
	private int id;
	private String name;
	public GetDep() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetDep(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
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
		return "GetDep [id=" + id + ", name=" + name + "]";
	}
}
