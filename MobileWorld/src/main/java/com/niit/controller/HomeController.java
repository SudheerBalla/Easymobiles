package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
public HomeController() {
	
	System.out.println("at controller");
	// TODO Auto-generated constructor stub
}
	
	@RequestMapping("/home")
	public String home()
	{
	return "home";	
	}
	
	@RequestMapping("/login")
	public String forlogin()
	{
	return "login";	
	}
	
	@RequestMapping("/contact")
	public String forcontact()
	{
	return "contact";	
	}
	@RequestMapping("/aboutus")
	public String foraboutus()
	{
	return "aboutus";	
	}
	@RequestMapping("/registe")
	public String forregister()
	{
	return "register";	
	}
	
	
	
}
