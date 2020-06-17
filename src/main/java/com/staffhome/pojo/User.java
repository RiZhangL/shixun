package com.staffhome.pojo;

public class User {
	
	private int id;
	private String name;
	private String password;
	private String state;
	private String creation_time;
	private int emp_id;
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
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", state=" + state + ", creation_time="
				+ creation_time + ", emp_id=" + emp_id + "]";
	}
	public User(int id, String name, String password, String state, String creation_time, int emp_id) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.state = state;
		this.creation_time = creation_time;
		this.emp_id = emp_id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
