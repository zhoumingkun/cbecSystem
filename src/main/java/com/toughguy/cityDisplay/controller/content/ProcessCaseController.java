package com.toughguy.cityDisplay.controller.content;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.service.content.prototype.IProcessCaseService;

@RestController
@RequestMapping("/processHandling")
public class ProcessCaseController {
	
	@Autowired
	private IProcessCaseService processCaseService;
	
	@RequestMapping("/findProcessCase")
	public Map<String,Object> findProcessCase(){
		return processCaseService.findProcessCase();
	}
	
	@RequestMapping("/findProcessCaseHB")
	public Map<String,Object> findProcessCaseHB(String tjTime){
		return processCaseService.findProcessCaseHB(tjTime);
	}
	
}
