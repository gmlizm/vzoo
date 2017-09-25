package com.aboo.vzoo.authcenter.controller;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	@GetMapping("/testauth")
	public String getTestName() {
		String name = "auth-center-apitest";
		return name;
	}
	
	@RequestMapping({ "/user", "/me" })
	public Map<String, String> user(Principal principal) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("name", principal.getName());
		return map;
	}
	
}
