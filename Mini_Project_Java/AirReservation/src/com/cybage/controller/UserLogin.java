package com.cybage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.dao.LoginDao;
import com.cybage.model.User;

@WebServlet("/Login")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("loginuser.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginDao loginDao = new LoginDao();

		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");

		User u = loginDao.getUser(emailid, password);
		if (u == null) {
			request.setAttribute("text", "Unsuccessful login");
			RequestDispatcher rd = request.getRequestDispatcher("loginuser.jsp");
			System.out.println("Error Login in");
		} else if (u.getEmailid().equals("pawan@gmail.com") && u.getPassword().equals("1234")) {
			request.setAttribute("text", "Successful login");
			RequestDispatcher rd = request.getRequestDispatcher("list");
			System.out.println("Admin Logged In Successfully");
			rd.forward(request, response);
			System.out.println(u);
		} else {
			request.setAttribute("text", "Successful login");
			RequestDispatcher rd = request.getRequestDispatcher("uflist");
			System.out.println("User Logged In Successfully");
			rd.forward(request, response);
			System.out.println(u);

		}
	}

}
