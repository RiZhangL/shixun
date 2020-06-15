package com.staffhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.staffhome.pojo.Employee;
import com.staffhome.service.impl.EmployeeMapperServiceImpl;

@Service
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeMapperServiceImpl service;

	@RequestMapping("/addEmp")
	public String addEmp(String name, String gender, String birthday,String address,String phone,String position,String department,int state,String creation_time) {
		service.addEmp(new Employee(name, gender, birthday,address,phone,position,department,state,creation_time));
		return "selectAllEmployee";
	}
	
	@RequestMapping(value = "/selectAllEmployee")
	public ModelAndView selectAllEmployee() {
		List<Employee> employees = service.selectAllEmployee();
		for (Employee employee : employees)
			System.out.println(employee);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", employees);
		mav.addObject("number", employees.size());
		mav.addObject("minist", employees.size() == 0 ? 0 : 1);
		mav.setViewName("/WEB-INF/webcontent/employee.jsp");
		return mav;
		
		
		
	}
	@RequestMapping(value = "/selectOneEmployee")
	public ModelAndView selectOneEmployee(String name) {
		List<Employee> employees = service.selectOneEmployee(name);
		for (Employee employee : employees)
			System.out.println(employee);
		ModelAndView view = new ModelAndView();
		view.addObject("list", employees);
		view.addObject("number", employees.size());
		view.addObject("minist", employees.size() == 0 ? 0 : 1);
		view.setViewName("/WEB-INF/webcontent/selectOneEmp.jsp");
		return view;
	}
	/*@RequestMapping("/OneEmployee")
	public ModelAndView OneEmployee(String name) {
		List<Employee> employees = service.selectOneEmployee(name);
		for (Employee employee : employees)
			System.out.println(employee);
		System.out.println("‘±π§œÍ«È");
		ModelAndView view = new ModelAndView();
		view.addObject("list", employees);
		view.addObject("number", employees.size());
		view.addObject("minist", employees.size() == 0 ? 0 : 1);
		view.setViewName("/WEB-INF/webcontent/OneEmp.jsp");
		return view;
	}*/
	@RequestMapping("/OneEmployee")
	public ModelAndView OneEmployee(String name, String gender, String birthday,String address,String phone,String position,String department,int state,String creation_time) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("name", name);
		mav.addObject("gender", gender);
		mav.addObject("birthday", birthday);
		mav.addObject("address", address);
		mav.addObject("phone", phone);
		mav.addObject("position", position);
		mav.addObject("department", department);
		mav.addObject("state", state);
		mav.addObject("creation_time", creation_time);
		mav.setViewName("/WEB-INF/webcontent/OneEmp.jsp");
		return mav;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(String name, String gender, String birthday,String address,String phone,String position,String department,int state,String creation_time,String item) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", item);
		mav.addObject("name", name);
		mav.addObject("gender", gender);
		mav.addObject("birthday", birthday);
		mav.addObject("address", address);
		mav.addObject("phone", phone);
		mav.addObject("position", position);
		mav.addObject("department", department);
		mav.addObject("state", state);
		mav.addObject("creation_time", creation_time);
		mav.setViewName("/WEB-INF/webcontent/updateEmp.jsp");
		return mav;
	}
	@RequestMapping("/updateEmp")
	public String updateEmp(String name, String gender, String birthday,String address,String phone,String position,String department,int state,String creation_time, String id) {
		Employee employee = new Employee(name, gender, birthday,address,phone,position,department,state,creation_time);
		employee.setId(Integer.parseInt(id));
		service.updateEmployee(employee);
		return "selectAllEmployee";
	}
	@RequestMapping("/deleteEmp")
	public String deleteEmp(int id) {
		service.deleteEmployee(id);
		return "selectAllEmployee";
	}

}
