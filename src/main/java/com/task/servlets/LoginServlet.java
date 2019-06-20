package com.task.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.dao.DAOProvider;
import com.task.entity.users.NormalUser;

@WebServlet(urlPatterns = { "/index.jsp" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		NormalUser user = DAOProvider.getDAO().getUserByUsername(username);
		req.getSession().setAttribute("current.user.username", user.getUsername());
		req.getSession().setAttribute("current.user.mail", user.getPassword());
		if (password.hashCode() == user.getPassword()) {
			String contextPath = req.getContextPath();
			resp.sendRedirect(contextPath + "/articles.jsp");
			return;
		}
		resp.sendRedirect("/task/index.jsp");
	}

}
