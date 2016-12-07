package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.webflow.engine.model.Model;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Controller
public class UserProductController {
	
	
	@Autowired
	ProductDao prodDao;
	
	
	@RequestMapping(value="/userproduct",method=RequestMethod.GET)
	public ModelAndView updateProd(@RequestParam("pid")String pid)
	{
		Product ad =prodDao.DispRecord(pid);
		ModelAndView m = new ModelAndView("userproduct","Product",ad);
		System.out.println(ad.getPid());
		System.out.println(ad.getPname());
		System.out.println(ad.getPprice());

		System.out.println("pro id"+ad.getPid());
		m.addObject("check",false);
		
		
		
		String pdjsonlist=prodDao.listProd();
		m.addObject("data3",pdjsonlist);
				return m;
	}
}