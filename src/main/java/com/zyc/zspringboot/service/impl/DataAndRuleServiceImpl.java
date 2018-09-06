package com.zyc.zspringboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyc.zspringboot.dao.DataAndRuleDao;
import com.zyc.zspringboot.service.DataAndRuleService;
import com.zyc.zspringboot.util.SqlResultConstant;

@Service("dataAndRuleService")
public class DataAndRuleServiceImpl implements DataAndRuleService {

	//@Autowired
	private DataAndRuleDao dataAndRuleDao;
	
	@Override
	public <T> List<T> findDataByTableName(Map<String,Object> map,T t) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		//此处根据表名获取相关查询语句
		String sqlResult=getSqlResultByTableName(map.get("tableName").toString());
		map.put("sqlResult", sqlResult);
		System.out.println(map.toString());
		return dataAndRuleDao.findDataByTableName(map.get("tableName").toString(),sqlResult,t);
	}

	private String getSqlResultByTableName(String tableName) throws IllegalArgumentException, IllegalAccessException{
		
		return SqlResultConstant.getAttr(tableName);
	}
}
