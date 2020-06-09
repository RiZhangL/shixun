package com.staffhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.Department;
import com.staffhome.service.impl.DepartmentMapperServiceImlp;

@Service
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentMapperServiceImlp service;

	@RequestMapping("/addDep")
	public String addDep(String name, String info, String manage_id) {
		service.addDep(new Department(name, info, manage_id));
		return "main";
	}

	@RequestMapping(value = "/querySimilar", method = RequestMethod.GET)
	public ModelAndView querySimilar(String name) {
		List<Department> list = service.querySimilar(name);
		for (Department c : list)
			System.out.println(c);
		ModelAndView view = new ModelAndView();
		view.addObject("list", list);
		view.setViewName("querySimilar");
		return view;
	}

	@RequestMapping("/updateDep")
	public String updateDep(String name, String info, String manager_id, int id) {
		Department department = new Department(name, info, manager_id);
		department.setId(id);
		service.updateDepertment(department);
		return "main";
	}

	@RequestMapping("/deleteDep")
	public String deleteDep(String name) {
		service.deleteDepartment(name);
		return "main";
	}

	@RequestMapping(value = "/queryAllDep", method = RequestMethod.GET)
	public ModelAndView queryAllDep() {
		List<Department> departments = service.queryAllDepartments();
		for (Department c : departments)
			System.out.println(c);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", departments);
		mav.setViewName("showAllDep");
		return mav;
	}
}
