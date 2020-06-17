package com.staffhome.service;

import com.staffhome.pojo.User;
import com.staffhome.pojo.GetDep;
import com.staffhome.pojo.GetPos;
import com.staffhome.pojo.SelectEmp;
import com.staffhome.pojo.SelectUser;

import java.util.List;

public interface UserMapperService {

	public void addEmployee(User emp);
	public List<GetDep> UserDep();
	public List<GetPos> UserPos();
	public List<SelectUser> GetAllEmp();
	public String IdToName(int emp_id);
	public void DeleteEmp(int id);
	public void ChangeEmp(User emp);
	public User GetEmpById(int id);
	public void FreezeEmp(int id);
	public void UnfreezeEmp(int id);
	public List<SelectEmp> SelectEmp();
	public String IdToUsername(int id);
	public int IdToEmpId(int id);
}
