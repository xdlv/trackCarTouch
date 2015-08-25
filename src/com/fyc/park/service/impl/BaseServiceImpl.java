package com.fyc.park.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.fyc.park.service.BaseService;

public class BaseServiceImpl implements BaseService {

	static Map<String, int[]> primaryKeyMap = new HashMap<String, int[]>();
	final static int PRE_OCCUPY_MAX = 10;
	
	@Override
	public int getAllCount() {
		return 0;
	}

	@Override
	public int getPrimaryKey(String tableName) {return 0;}

	protected void assertTrue(String msg, boolean flag){
		if (!flag){
			throw new RuntimeException(msg);
		}
	}
}