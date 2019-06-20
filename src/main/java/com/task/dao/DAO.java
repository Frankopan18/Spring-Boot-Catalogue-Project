package com.task.dao;

import com.task.entity.article.Article;
import com.task.entity.users.NormalUser;

public interface DAO {
	
	int createArticle(Article article);
	
	boolean deleteArticle(int id);
	
	Article getArticle(int id);
	
	NormalUser getUserByUsername(String username);

}
