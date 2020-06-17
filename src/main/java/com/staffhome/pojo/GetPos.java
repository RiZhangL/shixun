package com.staffhome.pojo;

public class GetPos {
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
		return "GetPos [id=" + id + ", name=" + name + "]";
	}
	public GetPos(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public GetPos() {
		super();
		// TODO Auto-generated constructor stub
	}
}
