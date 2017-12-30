package com.shiro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonsController {
	@RequestMapping(value = "company/zhengpeng")
	public String showCompany () {
		System.out.println("zheng_peng_company");
		return "zheng_peng_company";
	}
}
