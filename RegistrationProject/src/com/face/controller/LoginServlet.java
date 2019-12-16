package com.face.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**@author shone
 * Action Servlet implementation class LoginServlet
 * @date - 14/11/2019
 * @category controller class
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username =	request.getParameter("username");
		String password =	request.getParameter("passwordlog");
		LoginBO logbo= new LoginBO();
		logbo.setUsername(username);
		logbo.setPasssword(password);
		List status;
		
		
		ConnectionManager con= new ConnectionManager();
		try {
			status=LoginDAO.save(con.getConnection(),logbo);
			
			 request.setAttribute("habits",status);
		     RequestDispatcher view=request.getRequestDispatcher("welcome.jsp");
		     view.forward(request,response);
		}catch(Exception e) {
			e.printStackTrace();
		}}}
	
		
	
	

