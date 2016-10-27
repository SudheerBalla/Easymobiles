package com.niit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Register;

@RequestMapping(value = "/register")
@Controller
public class RegController {
	
	
	
	

	 @RequestMapping(method = RequestMethod.GET)
	    public String viewRegistration(Map<String, Object> model) {
		 
		 System.out.println("test1");
	        Register userForm = new Register();    
	         
	         model.put("uf",userForm);
	        return "register";
	    }
	    
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("uf") Register user,
	            Map<String, Object> model) {
	         
	        
	        System.out.println("name: " + user.getName());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("emailid: " + user.getEmailid());
	        System.out.println("mobno: " + user.getMobno());
	        
	         
	        return "result";
	    }
	}


