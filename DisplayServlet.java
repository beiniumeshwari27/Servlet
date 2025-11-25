package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("eemail");
		String mobile=request.getParameter("emobile");
		HttpSession hs=request.getSession();
		int employeeNumber=(int) hs.getAttribute("number");
		String employeeName=(String)hs.getAttribute("name");
		float employeeSalary=(float)hs.getAttribute("salary");
		String employeeAddress=(String)hs.getAttribute("address");
		out.println("<html><body bgcolor='lightgreen'>");
		out.println("<center><br><br>");
		out.println("<table bgcolor='lightyellow'>");
		out.println("<tr><td colspan='2'><center><b><font size='5' color='red'>");
		out.println("<u>Employee Details</u></font></b></center></td></tr>");
		out.println("<tr><td>Employee Number</td><td>"+employeeNumber+"</td></tr>");
		out.println("<tr><td>Employee Name</td><td>"+employeeName+"</td></tr>");
		out.println("<tr><td>Employee Salary</td><td>"+employeeSalary+"</td></tr>");
		out.println("<tr><td>Employee Address</td><td>"+employeeAddress+"</td></tr>");
		out.println("<tr><td>Employee Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>Employee Mobile</td><td>"+mobile+"</td></tr>");
		out.println("<tr><td>Status</td><td>Success</td></tr>");
		out.println("</table></center></body></html>");
	}

			
	}