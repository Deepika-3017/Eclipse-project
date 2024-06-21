package com.wipro.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Entering Servlet1");
		System.out.println(response.getStatus());
		
		System.out.println(response.getHeader("location"));
		
		//response.sendRedirect("Servlet2");
		//back to client/browser with response header status=302,and location="Servlet2"
		
//		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Servlet2");
//		requestDispatcher.include(request, response);
//		
//		request.getRequestDispatcher("servlet2").include(request, response);
//		request.getRequestDispatcher("servlet2").forward(request, response);
//		
		this.getServletContext().getRequestDispatcher("/servlet2").include(request, response);
		//this.getServletContext().getRequestDispatcher("/servlet2").forward(request, response);
		
		System.out.println(response.getStatus());
		System.out.println(response.getHeader("location"));
		out.println("Leaving Servlet1");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
