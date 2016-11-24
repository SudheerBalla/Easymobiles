package com.niit.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;

public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static Category category;
	
	@Autowired
	static CategoryDao categoryDao;
	
	
	@BeforeClass
	public static void init()
	{
	context = new AnnotationConfigApplicationContext();
	context.refresh();
	
	categoryDao=(CategoryDao) context.getBean("categoryDao");
	category=(Category) context.getBean("category");
	}
	@Test
	public void createCategoryTestCase()
	{
		System.out.println("test1");
		category.setCid("ra1234");
		category.setCname("nagole");
		category.setCdescription("animal");
		
		categoryDao.save(category);
		System.out.println("test2");
		
	}

}
