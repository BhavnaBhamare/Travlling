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

import com.model.BLManager;
import com.model.Emailutil;
import com.pojo.Registrationdata;
import com.pojo.Tourguide;
import com.pojo.Tourguidebooking;

@WebServlet("/ConfirmBookingTourGuide")
public class ConfirmBookingTourGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Registrationdata reg=new Registrationdata();
	BLManager bl = new BLManager();
	Tourguide tour=new Tourguide();
	Tourguidebooking t=new Tourguidebooking();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String no=(String)session.getAttribute("otpno");
		Integer tourid=(Integer)session.getAttribute("tourid");
		
		String email=(String)session.getAttribute("email");
		Date hdate=(Date)session.getAttribute("hdate");
		
		
		System.out.println("otp-----------"+no+"----"+email);
		
		String email1=request.getParameter("email");
		String otp=request.getParameter("otp");
		System.out.println("-----------"+otp);
		String msg1="Your Tour Guide Will be Confirm...";
		
		if(otp.equals(no))
		{
			ServletContext context = getServletContext();
			String host = context.getInitParameter("host");
			String port = context.getInitParameter("port");
			String user = context.getInitParameter("user");
			String pass = context.getInitParameter("pass");
			System.out.println(host + " " + port + "  " + user + " " + pass + " " + email1 + "  " + msg1);

			try {
				Emailutil.sendEmail2(host, port, user, pass, email1, msg1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			reg=bl.serachbyemail(email);
			tour=bl.serachbyguideid(tourid);
			
			t.setBookingdate(hdate);
			t.setRegistrationdata(reg);
			t.setTourguide(tour);
			
			bl.svaetourbooking(t);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Tour is Confirm...');");
			out.println("location='tourguideConfirmNow.jsp';");
			out.println("</script>");
		}else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Sorry OTP is Incorrect pLz try again...');");
			out.println("location='otppagetourguide.jsp';");
			out.println("</script>");
		}
		
		
	}

}
