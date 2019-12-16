package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**@author shone
 * Action Servlet implementation class RegisterServlet
 * @date - 14/11/2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec -> action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	String name =	request.getParameter("name");
	String mobile =	request.getParameter("mobile");
	String email =	request.getParameter("email");
	String password = request.getParameter("password");
	String repassword = request.getParameter("repassword");
	RegisterBO regbo= new RegisterBO();
	regbo.setName(name);
	regbo.setMobile(mobile);
	regbo.setEmail(email);
	regbo.setPassword(password);
	regbo.setRepassword(repassword);
	boolean status = false;
	ConnectionManager con= new ConnectionManager();
	try {
		status=RegisterDAO.save(con.getConnection(),regbo);
	}catch(Exception e) {
		e.printStackTrace();
	}
	if (status==true)
		response.sendRedirect("signin.jsp");
	}

}
