package com.task.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.task.dao.impl.DAOImpl;

public class DAOProvider {
	private static DAO dao = new DAOImpl();

	public static DAO getDAO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		dao = (DAO) context.getBean("dao");
		return dao;
	}

}
