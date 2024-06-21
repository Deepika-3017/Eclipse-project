package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.wipro.model.User;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			PrintWriter out = response.getWriter();
//			String email = request.getParameter("email");
//			String password =  request.getParameter("password");
			
			//System.out.println(email + "," +password);
			
//			User user=new User(email,password);
			
			//System.out.println(request.getParameter("birthdate"));
			
			LocalDate birthdate=LocalDate.parse(request.getParameter("birthdate"));
			
			User user= new User(request.getParameter("email"), 
					request.getParameter("password"),birthdate);
			
			
			out.println("<html><body><h2>Your Credentials:"+ user.getEmail()+","+
			user.getPassword()+","+user.getBirthdate()+"</h2></body></html>");
			
//			ServletConfig context=this.getServletConfig();
//			
//			out.println("<br><h2>"+context.getInitParameter("database")+"</h2>");

		
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
		}
//		out.println("<h1> Iam in Login Servlet</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
