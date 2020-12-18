package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Registrationdata;
import com.pojo.Roll;

@WebServlet("/RegistrationServ")
public class RegistrationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BLManager bl=new BLManager();
	Roll r=new Roll();
	Registrationdata reg=new Registrationdata();
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	    String fname=request.getParameter("fname");
	    String lname=request.getParameter("lname");
	    String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    String phone=request.getParameter("phone");
	    String country=request.getParameter("country");
	    String rollname=request.getParameter("User");
	    
	    r=bl.serachchbyroll(rollname);
	    
	    reg.setRoll(r);
	    reg.setFirstname(fname);
	    reg.setLastname(lname);
	    reg.setEmail(email);
	    reg.setPassword(pass);
	    reg.setMobile(phone);
	    reg.setCountry(country);
	   
	    
	    
	    bl.registrationsave(reg);
	    
	    out.println("<script type=\"text/javascript\">");
		out.println("alert('Registration Successfully...');");
		out.println("location='index.jsp';");
		out.println("</script>");
	    
	}
	

}
