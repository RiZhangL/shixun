package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffhome.mapper.DepartmentMapper;
import com.staffhome.pojo.Department;
import com.staffhome.service.DepartmentMapperService;

@Service
public class DepartmentMapperServiceImlp implements DepartmentMapperService {
	@Autowired
	DepartmentMapper mapper;

	public void addDep(Department department) {
		// TODO Auto-generated method stub
		mapper.addDepartment(department);
	}

	public List<Department> querySimilar(String name) {
		List<Department> list = mapper.querySimilar("%" + name + "%");
		return list;
	}

	public List<Department> queryAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> list = mapper.queryAllDepartments();
		return list;
	}

	public void updateDepertment(Department department) {
		// TODO Auto-generated method stub
		mapper.updateDepertment(department);
	}

	public void deleteDepartment(String name1) {
		// TODO Auto-generated method stub
		int name = Integer.parseInt(name1);
		mapper.deleteDepartment(name);
	}

}
