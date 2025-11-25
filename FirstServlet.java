package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name="/FirstServlet",urlPatterns= {"/first"},
initParams= {@WebInitParam(name="c",value="CCC"),
		@WebInitParam(name="d",value="DDD")
})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ServletConfig config=getServletConfig();
	ServletContext context=getServletContext();
	out.println("<html><body><h1>");
	out.println("a---->"+context.getInitParameter("a")+"<br>");
	out.println("b---->"+context.getInitParameter("b")+"<br>");
	out.println("c---->"+config.getInitParameter("c")+"<br>");
	out.println("d---->"+config.getInitParameter("d")+"<br>");
	out.println("e---->"+config.getInitParameter("e")+"<br>");
	out.println("f---->"+config.getInitParameter("f")+"<br>");
	out.println("</h1></body></html>");
	
	}

}