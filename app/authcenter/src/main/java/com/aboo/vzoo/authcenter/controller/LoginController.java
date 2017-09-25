package com.aboo.vzoo.authcenter.controller;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		System.out.println(request.getParameter("redirectUrl"));
		return "login";
	}
	
	@RequestMapping("/")
	public String main(){
		return "main";
	}

}
