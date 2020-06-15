package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.Employee;

public interface EmployeeMapper {
	public void addEmployee(Employee employee);
	
	public void deleteEmployee(int id);

	public List<Employee> selectAllEmployee();

	public void updateEmployee(Employee employee);

	

	public List<Employee> selectOneEmployee(String name);

}
