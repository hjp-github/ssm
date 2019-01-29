package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author hjp
 *
 */
@Controller
public class TestController {
	
	@RequestMapping("/holle")
	public String holle() {
		return "holle";
	}
	
}
