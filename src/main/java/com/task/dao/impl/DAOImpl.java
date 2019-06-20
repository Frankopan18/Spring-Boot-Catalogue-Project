package com.task.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.dao.DAO;
import com.task.entity.article.Article;
import com.task.entity.users.NormalUser;

@Repository("dao")
public class DAOImpl implements DAO{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int createArticle(Article article) {
		int result = (Integer) hibernateTemplate.save(article);
		return result;
	}

	@Transactional
	public boolean deleteArticle(int id) {
		if (getArticle(id) != null) {
			hibernateTemplate.delete(getArticle(id));
			return true;
		}
		return false;
	}

	@Transactional
	public Article getArticle(int id) {
		return hibernateTemplate.get(Article.class, id);
	}

	@Transactional
	public NormalUser getUserByUsername(String username) {
		List<NormalUser> users = hibernateTemplate.loadAll(NormalUser.class);
		for(NormalUser user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
