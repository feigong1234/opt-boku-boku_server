package com.boku.server.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.boku.server.dao.impl.IDBAccessor;

@Component
public class DBAccessor implements IDBAccessor{
	@Resource
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	public void init(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//SessionFactory sessionFactory = applicationContext.getBean("sessionFactory",SessionFactoryImpl.class);
		session = this.sessionFactory.openSession();
	}
	
	public void begin() throws Exception{
		transaction = session.beginTransaction();
		transaction.begin();
	}
	
	public void commit() throws Exception{
		session.flush();
		transaction.commit();
	}
	
	public void roolback() throws Exception {
		transaction.rollback();	
	}
	
	public boolean insert(Object obj){
		return session.save(obj) != null;
	}

	
}
