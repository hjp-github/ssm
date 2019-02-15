package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.ITestService;

/**
 * 
 * @author hjp
 * 
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ITestService testService;
	
	@RequestMapping("/holle")
	public String holle() {
		return "holle";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public void test() throws Exception {
		testService.test();
	}
	
}
