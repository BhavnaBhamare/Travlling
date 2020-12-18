package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Emailutil;

@WebServlet("/ConfirmBookingOTP1")
public class ConfirmBookingOTP1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		
		
		String email1=request.getParameter("email");
		
		String hdate=request.getParameter("hdate");
		String noofpeople=request.getParameter("noofpeople");
		
		Date d=Date.valueOf(hdate);
		
		session.setAttribute("hdate",d);
		session.setAttribute("noofpeople",noofpeople);
		
		System.out.println("--------------email..."+email1);
		
		int random=(int)(Math.random()*9000)+1000;
		String OTP=String.valueOf(random);
		
		session.setAttribute("otpno",OTP);
		
		
		ServletContext context = getServletContext();
		String host = context.getInitParameter("host");
		String port = context.getInitParameter("port");
		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		System.out.println(host + " " + port + "  " + user + " " + pass + " " + email1 + "  " + OTP);

		try {
			Emailutil.sendEmail1(host, port, user, pass, email1, OTP);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('OTP sent Successfully...');");
		out.println("location='otppagehotel.jsp';");
		out.println("</script>");
		
	}

}
