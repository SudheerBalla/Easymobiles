package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.model.Cart;

@Repository
public class CartDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertCart(Cart c) {

		Session session = sessionFactory.openSession();

		Transaction t = session.beginTransaction();
        System.out.println(c.getCartid());
        System.out.println(c.getPid());
        System.out.println(c.getPname());
        System.out.println(c.getPrice());
		session.save(c);

		t.commit();
		session.close();

	}
	
	
	public List listCart()
	{
		System.out.println("in CartDao at Cartlist method");
		Session se= sessionFactory.openSession();
		se.beginTransaction();
		List li=se.createQuery("from Cart").list();
	
		
		se.getTransaction().commit();
		se.close();
		return li;
	}
}