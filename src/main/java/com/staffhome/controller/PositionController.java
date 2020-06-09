package com.staffhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.Department;
import com.staffhome.pojo.Position;
import com.staffhome.service.impl.PositionMapperServiceImpl;

@Service
@RequestMapping("/position")
public class PositionController {
	@Autowired
	PositionMapperServiceImpl service;

	@RequestMapping(value = "/addPos")
	public String addPos(String name, String info, String money) {
		service.addPosition(new Position(name, info, money));
		return "queryAllPos";
	}

	@RequestMapping(value = "/querySimilar")
	public ModelAndView querySimilar(String name) {
		List<Position> list = service.querySimilar(name);
		for (Position c : list)
			System.out.println(c);
		ModelAndView view = new ModelAndView();
		view.addObject("list", list);
		view.addObject("number", list.size());
		view.addObject("minist", list.size() == 0 ? 0 : 1);
		view.setViewName("/WEB-INF/webcontent/querySimilarPos.jsp");
		return view;
	}

	@RequestMapping("/updatePos")
	public String updatePos(String name, String info, String money, int id) {
		Position pos = new Position(name, info, money);
		pos.setId(id);
		service.updatePosition(pos);
		return "queryAllPos";
	}

	@RequestMapping("/transmission")
	public ModelAndView transmission(String name, String info, String money, String item) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", item);
		mav.addObject("name", name);
		mav.addObject("money", money);
		mav.addObject("info", info);
		mav.setViewName("/WEB-INF/webcontent/updatePos.jsp");
		return mav;
	}

	@RequestMapping("/deletePos")
	public String deletePos(String id) {
		service.deletePosition(id);
		return "queryAllPos";
	}

	@RequestMapping(value = "/queryAllPos")
	public ModelAndView queryAllPos() {
		List<Position> positions = service.queryAllPositions();
		for (Position c : positions)
			System.out.println(c);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", positions);
		mav.addObject("number", positions.size());
		mav.addObject("minist", positions.size() == 0 ? 0 : 1);
		mav.setViewName("/WEB-INF/webcontent/position.jsp");
		return mav;
	}
}
