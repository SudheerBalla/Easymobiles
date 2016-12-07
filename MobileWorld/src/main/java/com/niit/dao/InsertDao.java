package com.niit.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Login;
import com.niit.model.Register;


@Repository
public class InsertDao {
	String usrrole,uname;
	
	 @Autowired
	private SessionFactory sessionFactory;

	
	 public void setSessionFactory(SessionFactory sessionFactory) {
	     this.sessionFactory = sessionFactory;
	 }
	public void insertData(Register r1)
	{
		
		    
		 
		    
		//creating session object    
		Session session=sessionFactory.openSession();    
		    
		//creating transaction object    
		Transaction t=session.beginTransaction();    
		        
		
		
		session.save(r1);//persisting the object    
		    
		t.commit();//transaction is commited    
		session.close();  
		}
	@SuppressWarnings("unused")
	@Transactional
	public boolean loginvalidate(Login login) {
		
		System.out.println("in Login  DAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ");
		String username=login.getUsername();
		String password=login.getPassword();
	
				String hql="from Register where userName='"+username+"' and password='"+password+"'";
				System.out.println("in Login  DAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 1111 ");
				Session session=sessionFactory.openSession();
				System.out.println("after open sessionnnnnnnnnnnnnnnnnnn");
				Transaction tn=session.beginTransaction();    
		        
				
				System.out.println("in Login  DAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 222222");
				Query query=session.createQuery(hql);
				System.out.println("in Login  DAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 3333");
		@SuppressWarnings("unchecked")
		List<Register> reg=query.list();
		System.out.println("this is loginvalidate"+hql);
	System.out.println("register"+reg);
	if(reg!=null)
	{
	for(Register t:reg)
	{
		
		
			usrrole = t.getRole();
			uname=t.getUserName();
			
		}
	return true;
	}
		else{
			return false;
		}
		

		

	}
	@Transactional
	public String userrole() {
		// TODO Auto-generated method stub
		return usrrole;
	}
	@Transactional
	public String username() {
		String username = null;
		// TODO Auto-generated method stub
		return uname;
	}
	
	
	
}

