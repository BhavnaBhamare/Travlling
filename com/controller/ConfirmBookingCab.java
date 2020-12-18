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
import com.pojo.Cabbooking;
import com.pojo.Cabs;
import com.pojo.Registrationdata;


@WebServlet("/ConfirmBookingCab")
public class ConfirmBookingCab extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	Registrationdata reg=new Registrationdata();
	Cabs c=new Cabs();
	Cabbooking cabs=new Cabbooking();
	BLManager bl = new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String no=(String)session.getAttribute("otpno");
		Integer cid=(Integer)session.getAttribute("cid");
		
		String email=(String)session.getAttribute("email");
		Date hdate=(Date)session.getAttribute("hdate");
		String noofpeople=(String)session.getAttribute("noofpeople");
		
		
		System.out.println("otp-----------"+no+"----"+email);
		
		String email1=request.getParameter("email");
		String otp=request.getParameter("otp");
		System.out.println("-----------"+otp);
		String msg1="Your Hotel Will be Confirm...";
		
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
			c=bl.serachbycabid(cid);
			
			cabs.setBookingdate(hdate);
			cabs.setNoofpeople(noofpeople);
			cabs.setRegistrationdata(reg);
			cabs.setCabs(c);
			
			bl.svaecabbooking(cabs);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Cab Booking is Confirm...');");
			out.println("location='cabConfirmNow.jsp';");
			out.println("</script>");
		}else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Sorry OTP is Incorrect pLz try again...');");
			out.println("location='otppagecab.jsp';");
			out.println("</script>");
		}
		
	}

}
