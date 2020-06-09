package com.staffhome.pojo;

public class Department {
	private int id;
	private String name;
	private String info;
	private String manager_id;

	public Department() {
		super();
	}

	public Department(String name, String info, String id) {
		super();
		this.name = name;
		this.info = info;
		this.manager_id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", info=" + info + ", manager_id=" + manager_id + "]";
	}

}
