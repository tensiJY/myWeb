package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Main")
public class WebController {
		
	@RequestMapping(value ="/Main", method={RequestMethod.GET})
	public String main(){
		System.out.println("String" + 1);
		return "";
	}
	
	
	
	
}

