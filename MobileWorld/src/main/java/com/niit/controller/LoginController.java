package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.InsertDao;
import com.niit.model.Login;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	InsertDao inDao;

	@RequestMapping(method = RequestMethod.GET)
	public String logins(ModelMap m) {
		m.addAttribute("login", new Login());

		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String loginsucces(@ModelAttribute("login") Login login, ModelMap m, HttpSession sess) {
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		// inDao.loginvalidate(login);
		boolean valid = inDao.loginvalidate(login);
		String urole = inDao.userrole();

		if (valid && urole.equals("user")) {
			String uname = inDao.username();
			m.addAttribute("role", inDao.username());

			System.out.println(uname);
			return "index";
		} else if (valid && inDao.userrole().equals("admin")) {

			return "admin";
		} else {
			m.addAttribute("message", "InvalidUser");
			m.addAttribute("clickloginsss", 1);
			return "login";

		}

	}

}