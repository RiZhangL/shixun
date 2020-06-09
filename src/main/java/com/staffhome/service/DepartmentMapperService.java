package com.staffhome.service;

import java.util.List;

import com.staffhome.pojo.Department;

public interface DepartmentMapperService {
	public void addDep(Department department);

	public List<Department> querySimilar(String name);

	public List<Department> queryAllDepartments();

	public void updateDepertment(Department department);

	public void deleteDepartment(String name);
}
