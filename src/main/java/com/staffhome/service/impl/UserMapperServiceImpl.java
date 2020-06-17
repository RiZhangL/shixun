package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffhome.mapper.UserMapper;
import com.staffhome.pojo.User;
import com.staffhome.pojo.GetDep;
import com.staffhome.pojo.GetPos;
import com.staffhome.pojo.SelectUser;
import com.staffhome.pojo.SelectEmp;
import com.staffhome.service.UserMapperService;

@Service
public class UserMapperServiceImpl implements UserMapperService{
	@Autowired
	UserMapper mapper;

	public void addEmployee(User emp) {
		mapper.addEmp(emp);
		
	}

	public List<GetDep> UserDep() {
		List<GetDep> list = mapper.getDep();
		return list;
	}

	public List<GetPos> UserPos() {
		List<GetPos> list = mapper.getPos();
		return list;
	}

	public List<SelectUser> GetAllEmp() {
		List<SelectUser> list = mapper.getAllEmp();
		return list;
	}

	public String IdToName(int emp_id) {
		String emp_name = mapper.idToName(emp_id);
		return emp_name;
	}

	public void DeleteEmp(int id) {
		mapper.deleteEmp(id);
	}

	public void ChangeEmp(User emp) {
		mapper.changeEmp(emp);
		
	}

	public User GetEmpById(int id) {
		User emp = mapper.getEmpById(id);
		return emp;
	}

	public void FreezeEmp(int id) {
		mapper.freezeEmp(id);
		
	}

	public void UnfreezeEmp(int id) {
		mapper.unfreezeEmp(id);
		
	}

	public List<SelectEmp> SelectEmp() {
		List<SelectEmp> emp = mapper.selectEmp();
		return emp;
	}

	public String IdToUsername(int id) {
		String username = mapper.idToUsername(id);
		return username;
	}

	public int IdToEmpId(int id) {
		int emp_id = mapper.idToEmpId(id);
		return emp_id;
	}
	
}
