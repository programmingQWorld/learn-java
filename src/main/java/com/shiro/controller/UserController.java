package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login (@RequestParam("username") String username, @RequestParam("password") String password) {
		if ("tomcat".equals(username) && "123".equals(password)) {
			return "success";
		}
		return "login";
	}
}
