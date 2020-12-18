package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Registrationdata;
import com.pojo.Roll;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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
		
	    String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    
	    System.out.println(email+"---"+pass);
	    
	    boolean b=bl.serachbyep(email,pass);
	    
	    System.out.println(b);
	    
	    if(b==true)
	    {
	    	reg=bl.serachbyemail(email);
	    	String fname=reg.getFirstname();
	    	String roll=reg.getRoll().getRollname();
	    	String lname=reg.getLastname();
	    	String password=reg.getPassword();
	    	String mob=reg.getMobile();
	    	String country=reg.getCountry();
	    	
	    	System.out.println("------------>>> "+roll);
	    	
	    	if(roll.equals("Admin"))
	    	{
	    		
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Admin Dash');");
				out.println("location='admindash.jsp';");
				out.println("</script>");
				
				
	    	}else if(roll.equals("HotelAdmin"))
	    	{
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Hotel Dash');");
				out.println("location='hoteldash.jsp';");
				out.println("</script>");
	    		
	    		
	    	}else if(roll.equals("FlightAdmin"))
	    	{
	    		
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Flight Dash');");
				out.println("location='flightdash.jsp';");
				out.println("</script>");
	    		
	    	}else if(roll.equals("PackageAdmin"))
	    	{
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Package Dash');");
				out.println("location='packagedash.jsp';");
				out.println("</script>");
				
	    		
	    	}else if(roll.equals("CabsAdmin"))
	    	{
	    		
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Cabs Dash');");
				out.println("location='cabsdash.jsp';");
				out.println("</script>");
				
				
	    	}else if(roll.equals("TravelGuideAdmin"))
	    	{
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome To Travel Guide Dash');");
				out.println("location='guidedash.jsp';");
				out.println("</script>");
				
	    	}else if(roll.equals("User"))
	    	{
	    		HttpSession session=request.getSession();
	    		session.setAttribute("fname",fname);
	    		session.setAttribute("email",email);
	    		session.setAttribute("lname",lname);
	    		session.setAttribute("password",password);
	    		session.setAttribute("mob",mob);
	    		session.setAttribute("country",country);
	    		
	    		out.println("<script type=\"text/javascript\">");
				out.println("alert('Welcome User Dash');");
				out.println("location='index.jsp';");
				out.println("</script>");
	    		
	    	}
	    }else
	    {
	    	out.println("<script type=\"text/javascript\">");
			out.println("alert('Email & password is incorrect Plz try again');");
			out.println("location='login.jsp';");
			out.println("</script>");
	    }
	    
	}

}
