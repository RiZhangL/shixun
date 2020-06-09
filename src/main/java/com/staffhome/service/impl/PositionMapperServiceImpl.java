package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffhome.mapper.PositionMapper;
import com.staffhome.pojo.Position;
import com.staffhome.service.PositionMapperService;

@Service
public class PositionMapperServiceImpl implements PositionMapperService {
	@Autowired
	PositionMapper mapper;

	public void addPosition(Position position) {
		// TODO Auto-generated method stub
		mapper.addPosition(position);
	}

	public List<Position> queryAllPositions() {
		// TODO Auto-generated method stub
		List<Position> list = mapper.queryAllPositions();
		return list;
	}

	public void updatePosition(Position position) {
		// TODO Auto-generated method stub
		mapper.updatePosition(position);
	}

	public void deletePosition(String id_) {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(id_);
		mapper.deletePosition(id);
	}

	public List<Position> querySimilar(String name) {
		List<Position> list = mapper.querySimilar("%" + name + "%");
		return list;
	}

}
