package com.container.containercrush.dao;

import java.util.List;

import com.container.containercrush.entity.Test;

public interface TestDao {
	
	public List<Test> getAllObjects();
	public Test getDataById(int id);

}
