package com.cybage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;

import com.cybage.model.User;


@WebServlet("/register")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1;
	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String contactNo = request.getParameter("contactNo");
		String address = request.getParameter("address");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");


		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setGender(gender);
		user.setAge(age);
		user.setContactNo(contactNo);
		user.setAddress(address);
		user.setEmailid(emailid);
		user.setPassword(password);


		try {
			userDao.registerUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("userdetails.jsp");
	}
}