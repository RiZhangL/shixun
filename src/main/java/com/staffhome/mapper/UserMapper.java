package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.User;
import com.staffhome.pojo.GetDep;
import com.staffhome.pojo.GetPos;
import com.staffhome.pojo.SelectEmp;
import com.staffhome.pojo.SelectUser;

public interface UserMapper {

	public void addEmp(User emp);
	public List<GetDep> getDep();
	public List<GetPos> getPos();
	public List<SelectUser> getAllEmp();
	public String idToName(int emp_id);
	public void deleteEmp(int id);
	public void changeEmp(User emp);
	public User getEmpById(int id);
	public void freezeEmp(int id);
	public void unfreezeEmp(int id);
	public List<SelectEmp> selectEmp();
	public String idToUsername(int id);
	public int idToEmpId(int id);
	
}
