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


import com.niit.model.Register;


@Repository
public class InsertDao {
	
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
	
	
	
	
}

