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
	public String addDep(String name, String info, String manager_id) {
		service.addDep(new Department(name, info, manager_id));
		return "queryAllDep";
	}

	@RequestMapping(value = "/querySimilar")
	public ModelAndView querySimilar(String name) {
		List<Department> list = service.querySimilar(name);
		for (Department c : list)
			System.out.println(c);
		ModelAndView view = new ModelAndView();
		view.addObject("list", list);
		view.addObject("number", list.size());
		view.addObject("minist", list.size() == 0 ? 0 : 1);
		view.setViewName("/WEB-INF/webcontent/querySimilarDep.jsp");
		return view;
	}

	@RequestMapping("/updateDep")
	public String updateDep(String name, String info, String manager_id, String id) {
		Department department = new Department(name, info, manager_id);
		department.setId(Integer.parseInt(id));
		service.updateDepertment(department);
		return "queryAllDep";
	}

	@RequestMapping("/deleteDep")
	public String deleteDep(String id) {
		service.deleteDepartment(id);
		return "queryAllDep";
	}

	@RequestMapping("/transmission")
	public ModelAndView transmission(String name,String info,String manager_id,String item) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", item);
		mav.addObject("name", name);
		mav.addObject("manager_id", manager_id);
		mav.addObject("info", info);
		mav.setViewName("/WEB-INF/webcontent/updateDep.jsp");
		return mav;
	}

	@RequestMapping(value = "/queryAllDep")
	public ModelAndView queryAllDep() {
		List<Department> departments = service.queryAllDepartments();
		for (Department c : departments)
			System.out.println(c);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", departments);
		mav.addObject("number", departments.size());
		mav.addObject("minist", departments.size() == 0 ? 0 : 1);
		mav.setViewName("/WEB-INF/webcontent/department.jsp");
		return mav;
	}
}
