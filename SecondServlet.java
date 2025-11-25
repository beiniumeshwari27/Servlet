package com.codegnan.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float salary=Float.parseFloat(request.getParameter("esal"));
		String address=request.getParameter("eaddr");
		HttpSession hs=request.getSession();
		hs.setAttribute("salary",salary);
		hs.setAttribute("address",address);
		RequestDispatcher rd=request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
		
	}

}