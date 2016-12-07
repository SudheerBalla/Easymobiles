package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.SupplierDao;
import com.niit.model.Product;

@Controller
public class HomeController {
	@Autowired
	CategoryDao catDao;
	@Autowired
	SupplierDao supDao;
	@Autowired
	ProductDao prodDao;
	
public HomeController() {
	
	System.out.println("at controller");
	// TODO Auto-generated constructor stub
}
	
	@RequestMapping("/index")
	public String home()
	{
	return "index";	
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
	
	@RequestMapping("/admin")
	public String adhome()
	{
	return "admin";	
	}
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView showProduct()
	{
		ModelAndView mv = new ModelAndView("products","Product",new Product());
	    String catjsonlist=catDao.listCat();
	    mv.addObject("data",catjsonlist);
	    
	    String supjsonlist=supDao.listSup();
	    mv.addObject("data2",supjsonlist);
	    String prod=prodDao.listProd();
	    mv.addObject("data3",prod);
	    mv.addObject("check", true);
	    return mv;    
	}
	
	
	@RequestMapping(value="/moreinfo",method=RequestMethod.GET)
	public ModelAndView showProduct1()
	{
		ModelAndView mv = new ModelAndView("moreinfo","Product",new Product());
	    String catjsonlist=catDao.listCat();
	    mv.addObject("data",catjsonlist);
	    
	    String supjsonlist=supDao.listSup();
	    mv.addObject("data2",supjsonlist);
	    String prod=prodDao.listProd();
	    mv.addObject("data3",prod);
	    mv.addObject("check", true);
	    return mv;    
	}	
	
	
	@RequestMapping("/categor")
	public String category()
	{
	return "category";	
	}
}
