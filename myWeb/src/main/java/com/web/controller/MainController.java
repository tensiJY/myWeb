package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.util.WebUtil;

@Controller
@RequestMapping("/main")
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/main")
	public String main(Model model, HttpServletRequest request, HttpSession session) throws Exception{
		
		try{ 
			String userIp = WebUtil.getUserIP(request);
			
			
			
			
		}catch(Exception e){
			logger.debug(e.getMessage());
		}
		
		return "main/main";
	}
	
}//
