package com.task.servlets;

import com.task.dao.DAOProvider;
import com.task.entity.users.NormalUser;


public class Test {
	public static void main(String[] args) {
		NormalUser user = DAOProvider.getDAO().getUserByUsername("Harry");
		System.out.println(user);
	}
}
