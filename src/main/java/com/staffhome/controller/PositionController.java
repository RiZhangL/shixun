package com.staffhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.staffhome.pojo.Position;
import com.staffhome.service.impl.PositionMapperServiceImpl;

@Service
@RequestMapping("/position")
public class PositionController {
	@Autowired
	PositionMapperServiceImpl service;

	@RequestMapping("/addPos")
	public String addPos(String name, String info) {
		service.addPosition(new Position(name, info));
		return "main";
	}

	@RequestMapping(value = "/querySimilar", method = RequestMethod.GET)
	public ModelAndView querySimilar(String name) {
		List<Position> list = service.querySimilar(name);
		for (Position c : list)
			System.out.println(c);
		ModelAndView view = new ModelAndView();
		view.addObject("list", list);
		view.setViewName("querySimilar");
		return view;
	}

	@RequestMapping("/updatePos")
	public String updatePos(String name, String info, int id) {
		Position pos = new Position(name, info);
		pos.setId(id);
		service.updatePosition(pos);
		return "main";
	}

	@RequestMapping("/deletePos")
	public String deletePos(String name) {
		service.deletePosition(name);
		return "main";
	}

	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	public ModelAndView queryAllPos() {
		List<Position> positions = service.queryAllPositions();
		for (Position c : positions)
			System.out.println(c);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", positions);
		mav.setViewName("showAllPos");
		return mav;
	}
}
