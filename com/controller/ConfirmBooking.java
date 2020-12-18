package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.model.Emailutil;
import com.pojo.Bookedticket;
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/ConfirmBooking")
public class ConfirmBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Registrationdata reg=new Registrationdata();
	Bookedticket booking=new Bookedticket();
	Flight f=new Flight();
	BLManager bl = new BLManager();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String no=(String)session.getAttribute("otpno");
		Integer flightid=(Integer)session.getAttribute("flightid");
		
		String email=(String)session.getAttribute("email");
		System.out.println("otp-----------"+no+"----"+email);
		
		String email1=request.getParameter("email");
		String otp=request.getParameter("otp");
		System.out.println("-----------"+otp);
		String msg1="Your Ticket Will be Confirm...";
	
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
			f=bl.serachbyflightid(flightid);
			
			booking.setFlight(f);
			booking.setRegistrationdata(reg);
			
			bl.svaebooking(booking);
			
			
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Booking is Confirm...');");
			out.println("location='ticketConfirm.jsp';");
			out.println("</script>");
		}else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Sorry OTP is Incorrect pLz try again...');");
			out.println("location='otppage.jsp';");
			out.println("</script>");
		}
	}

}
