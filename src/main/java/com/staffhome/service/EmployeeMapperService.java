package com.staffhome.service;


import java.util.List;


import com.staffhome.pojo.Employee;

public interface EmployeeMapperService {
	public void addEmp(Employee employee);
	
	public List<Employee> selectOneEmployee(String name);

	public List<Employee> selectAllEmployee();

	public void updateEmployeet(Employee employee);

	public void deleteEmployee(int id);

}
