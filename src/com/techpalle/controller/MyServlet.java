package com.techpalle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//that doGet() logic will write here
		String e=request.getParameter("tbE");
		String p=request.getParameter("tbP");
		System.out.println("Email:"+e);
		System.out.println("Password:"+p);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//inside doPost() we call doGet() bcoz most of logic will present in doGet method
		doGet(request, response);
	}

}
