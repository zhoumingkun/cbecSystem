package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.persist.content.prototype.IDictXZQHBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 字典表-行政区划表Dao实现类
 * @author zmk
 *
 */
@Repository
public class DictXZQHBImpl extends GenericDaoImpl<DictXZQHB, Integer> implements IDictXZQHBDao{
	
	@Override
	public List<DictXZQHB> findAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findAll");
	}

	@Override
	public void save(DictXZQHB xzqh) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update(typeNameSpace + ".save",xzqh);
	}
	
	@Override
	public void updateXZQH(DictXZQHB xzqh) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update(typeNameSpace + ".updateXZQH",xzqh);
	}

	
	
}
