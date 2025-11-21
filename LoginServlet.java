package com.codegnan.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	String name=request.getParameter("uname");
	String password=request.getParameter("upwd");
	RequestDispatcher requestDispatcher=null;
	if(name.equals("Naganjali")&&password.equals("beiniumeshwari@gmail.com")) {
		requestDispatcher=request.getRequestDispatcher("/sucess.html");
		requestDispatcher.forward(request, response);
	}else {
		requestDispatcher=request.getRequestDispatcher("/failure.html");
		requestDispatcher.forward(request, response);
	}
	
	}
}