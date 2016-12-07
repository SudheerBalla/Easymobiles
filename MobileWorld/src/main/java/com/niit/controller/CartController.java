package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.webflow.engine.model.Model;

import com.niit.dao.CartDao;
import com.niit.dao.ProductDao;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;

@Controller
public class CartController {
	
	
	@Autowired
	ProductDao prodDao;
	@Autowired
	CartDao cartDao;
	
	
	@RequestMapping(value = "/AddToCart", method = RequestMethod.GET)
	public ModelAndView AddCart(@RequestParam("pid") String pid,@RequestParam("s") int quantity) {
		
		Product p = prodDao.DispRecord(pid);
		Cart c = new Cart();
	
		c.setPid(""+p.getPid());
		
		c.setProdname(p.getPname());
		c.setPrice(p.getPprice());
		c.setTotal(quantity*p.getPprice());
		c.setQuantity(quantity);
		int totalprice=0;
		totalprice=totalprice+quantity*p.getPprice();
		
		cartDao.insertCart(c);
		List cartlist=cartDao.listCart();
		ModelAndView mv = new ModelAndView("car","Crt",cartlist);
		System.out.println("pro id" + p.getPid());
		
		
		return mv;

	}	

}