package com.staffhome.pojo;

public class SelectUser {
	private int id;
	private String name;
	private String password;
	private String state;
	private String creation_time;
	private String emp_name;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "SelectUser [id=" + id + ", name=" + name + ", password=" + password + ", state=" + state
				+ ", creation_time=" + creation_time + ", emp_name=" + emp_name + "]";
	}
	public SelectUser(int id, String name, String password, String state, String creation_time, String emp_name) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.state = state;
		this.creation_time = creation_time;
		this.emp_name = emp_name;
	}
	public SelectUser() {
		super();
		// TODO Auto-generated constructor stub
	}

}
