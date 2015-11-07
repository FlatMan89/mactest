package com.flatman.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password")String password){
		if(username==null || password==null)
			return "index";
		if(username.equals("yehunn") && password.equals("123456")){
			return "login";
		}else{
			return "index";
		}
	}
}
