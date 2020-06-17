package com.staffhome.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.User;
import com.staffhome.pojo.GetDep;
import com.staffhome.pojo.GetPos;
import com.staffhome.pojo.SelectEmp;
import com.staffhome.pojo.SelectUser;
import com.staffhome.service.impl.UserMapperServiceImpl;
import com.sun.org.glassfish.gmbal.ParameterNames;

@Service
@RequestMapping("/user")
public class UserMapperController {
	@Autowired
	UserMapperServiceImpl service;
	
	
	@RequestMapping("/addEmp")
	public ModelAndView addEmp(String name, String password, int emp_id) {
		String state = "正常";
		String emp_name = service.IdToName(emp_id);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String creation_time = simpleDateFormat.format(date);
		User user = new User(0, name, password, state, creation_time, emp_id);
		service.addEmployee(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("success", "添加成功！");
		mav.addObject("name", name);
		mav.addObject("emp_name", emp_name);
		mav.setViewName("/users/addUserSuccess.jsp");
		return mav;
	}
	
	
	@RequestMapping("/getDep")
	public ModelAndView getDep() {
		List<GetDep> dep = service.UserDep();
		List<GetPos> pos = service.UserPos();
		List<SelectEmp> emp = service.SelectEmp();
		ModelAndView mav = new ModelAndView();
		mav.addObject("dep", dep);
		mav.addObject("pos", pos);
		mav.addObject("emp", emp);
		mav.setViewName("/users/addUser.jsp");
		return mav;
	}
	
	@RequestMapping("/getAllEmp")
	public ModelAndView getAllEmp() {
		List<SelectUser> allUser = service.GetAllEmp();
		ModelAndView mav = new ModelAndView();
		mav.addObject("allUser", allUser);
		mav.setViewName("/users/selectUser.jsp");
		return mav;
		
	}
	
	


	@RequestMapping(value = "/deleteConfirm")
	public ModelAndView deleteConfirm(Integer id) {
		ModelAndView mav = new ModelAndView();
		if (id == null) {
			mav.setViewName("/user/getAllEmp");
			return mav;
		} else {
			String username = service.IdToUsername(id);
			int emp_id = service.IdToEmpId(id);
			String name = service.IdToName(emp_id);
			mav.addObject("name", name);
			mav.addObject("id", id);
			mav.addObject("username", username);
			mav.setViewName("/users/DeleteConfirm.jsp");
			return mav;
		}
		
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmp(Integer id) {
		ModelAndView mav = new ModelAndView();
		service.DeleteEmp(id);
		mav.setViewName("/user/getAllEmp");
		return mav;
		
	}
	@RequestMapping("/changeEmp")
	public ModelAndView changeEmp(Integer id) {
		ModelAndView mav = new ModelAndView();
		if (id == null) {
			mav.setViewName("/user/getAllEmp");
			return mav;
		} else {
			User user = service.GetEmpById(id);
			String name = service.IdToName(user.getEmp_id());
			List<SelectEmp> emp = service.SelectEmp();
			mav.addObject("user", user);
			mav.addObject("name", name);
			mav.addObject("emp", emp);
			mav.setViewName("/users/changeEmployee.jsp");
			return mav;
		}
		
		
	}
	
	@RequestMapping("/changeSucceed")
	public ModelAndView changeSucceed(Integer id, String name, String password, Integer emp_id) {
		User user = service.GetEmpById(id);
		user.setName(name);
		user.setPassword(password);
		user.setEmp_id(emp_id);
		service.ChangeEmp(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/getAllEmp");
		return mav;
	}
	
	@RequestMapping("/freezeEmp")
	public ModelAndView freezeEmp(Integer id) {
		ModelAndView mav = new ModelAndView();
		if (id == null) {
			mav.setViewName("/user/getAllEmp");
			return mav;
		} else {
			User user = service.GetEmpById(id);
			if (user.getState().equals("正常")) {
				service.FreezeEmp(id);
				mav.setViewName("/user/getAllEmp");
				return mav;
			} else {
				service.UnfreezeEmp(id);
				mav.setViewName("/user/getAllEmp");
				return mav;
			}
		}
		
		
	}
}
