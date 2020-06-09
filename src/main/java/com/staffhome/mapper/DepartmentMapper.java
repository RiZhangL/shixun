package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.Department;

public interface DepartmentMapper {
	public void addDepartment(Department department);

	public List<Department> queryAllDepartments();

	public void updateDepertment(Department department);

	public void deleteDepartment(String name);

	public List<Department> querySimilar(String name);
}
