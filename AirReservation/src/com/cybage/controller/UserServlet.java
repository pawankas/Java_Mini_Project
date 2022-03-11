package com.cybage.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/register")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private UserDao userDao;

    public void init() {
    	userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        String email = request.getParameter("email");
   

        User user = new User();
        user.setUname(uname);
        user.setUpass(upass);
        user.setEmail(email);


        try {
        	userDao.registerUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("userdetails.jsp");
    }
}