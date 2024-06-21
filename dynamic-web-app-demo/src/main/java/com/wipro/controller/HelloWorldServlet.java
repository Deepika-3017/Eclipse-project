package com.wipro.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * http:localhost:8081/dynamiv-web-app-demo
 * 
 * since default http method is GET controlles enters intogdoGet()
 * 
 * HttpServlet----->GenericServlet------> servlet
 * 
 * Servlet is an interface,GenericServlet is an class that implements Servlet
 * 
 * HttpServlet is an class that extend GenericServlet
 * 
 * GenericServlet can handle ant type of protocol(Httop,Ftp,Smtp, etc)whereas httpServlet
 * can handle only Http protocol. Since most of the web Application are http-base, ew Create our
 * own Servlet that extend HttpServlet
 */


@WebServlet(urlPatterns="/hello",
		initParams= {
				@WebInitParam(name="user",value="Deepika"),
				@WebInitParam(name="job",value="Trainee"),
				//@WebInitParam(name="database",value="Oracle")
		})
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
//    public HelloWorldServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//dynamically generate the content
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<html><body><h1><font color='red'>Welcome to My Dynamic Page</font></h1></body></html>");
		
		ServletConfig config=this.getServletConfig();
		
		out.println(config.getInitParameter("user"));
		out.println(config.getInitParameter("job"));
		
		ServletContext context=this.getServletContext();
		
		out.println("</br><h2>"+context.getInitParameter("database")+"</h2>");
		
		out.println("</br><h2>"+context.getAttribute("college")+"</h2>");

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
