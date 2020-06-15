package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.staffhome.mapper.EmployeeMapper;
import com.staffhome.pojo.Employee;

@Service
public class EmployeeMapperServiceImpl {
	@Autowired
	EmployeeMapper mapper;

	public void addEmp(Employee employee) {
		
		mapper.addEmployee(employee);
	}
	
	public List<Employee> selectOneEmployee(String name) {
		List<Employee> list = mapper.selectOneEmployee("%" + name + "%");
		return list;
	}

	public List<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = mapper.selectAllEmployee();
		return list;
	}
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		mapper.updateEmployee(employee);;
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		mapper.deleteEmployee(id);
	}

}
