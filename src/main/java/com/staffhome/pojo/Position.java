package com.staffhome.pojo;

public class Position {
	private int id;
	private String name;
	private String info;
	private String money;

	public Position() {
		super();
	}

	public Position(String name, String info, String money) {
		super();
		this.name = name;
		this.info = info;
		this.money = money;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", info=" + info + ", money=" + money + "]";
	}

}
