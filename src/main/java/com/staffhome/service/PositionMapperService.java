package com.staffhome.service;

import java.util.List;

import com.staffhome.pojo.Position;

public interface PositionMapperService {
	public void addPosition(Position position);

	public List<Position> queryAllPositions();

	public void updatePosition(Position position);

	public void deletePosition(String name);

	public List<Position> querySimilar(String name);
}
