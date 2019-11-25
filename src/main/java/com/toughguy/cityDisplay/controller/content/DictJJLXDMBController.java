package com.toughguy.cityDisplay.controller.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toughguy.cityDisplay.model.content.DictJJLXDMB;
import com.toughguy.cityDisplay.pagination.PagerModel;
import com.toughguy.cityDisplay.service.content.prototype.IDictJJLXDMBService;

@RestController
@RequestMapping(value = "/dictJJLXDMB")
public class DictJJLXDMBController {
	@Autowired
	private IDictJJLXDMBService dictJJLXDMBService;
	
	
	

	
	
	@ResponseBody
	@RequestMapping(value = "/getAll")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<DictJJLXDMB> getAll() {
		return  dictJJLXDMBService.findAll();
	}
	

}
