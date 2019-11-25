package com.toughguy.cityDisplay.persist.content.prototype;
import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.DictBJFSDMB;
import com.toughguy.cityDisplay.model.content.RecBJFSTJB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 统计表表-报警方式统计表 Dao接口类
 * @author zmk
 *
 */
public interface IRecBJFSTJBDao extends IGenericDao<RecBJFSTJB, Integer> {
	
	//查询今日报警方式 （首页）
	public List<RecBJFSTJB>  findBJFSShen(String tjTime);
		
	//查询报警方式七天全省 （首页）
	public List<RecBJFSTJB>  findBJFSSevenDayShen(Map<String,String> map);
	
	
	//查询报警方式全省全部数据(有行政区划)
	public List<RecBJFSTJB>  findSAlarmModeXZQH(Map<String,String> map);
	
	//查询报警方式某地市全部数据
	public List<RecBJFSTJB>  findCityAlarmMode(Map<String,String> map);
}
