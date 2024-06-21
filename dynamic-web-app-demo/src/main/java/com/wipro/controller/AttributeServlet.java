package com.wipro.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/attr")
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		request.setAttribute("greeting", "Hi, Welcome to my home");
		request.setAttribute("dinner", "Great meal tonight");
		
		ServletContext context= this.getServletContext();
		context.setAttribute("college","MGM College of Engineering");
		
		
		out.println(request.getAttribute("greeting"));
		out.println(request.getAttribute("dinner"));
		
		out.println(context.getAttribute("college"));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
