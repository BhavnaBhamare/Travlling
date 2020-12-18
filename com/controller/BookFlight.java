package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/BookFlight")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Registrationdata reg = new Registrationdata();
	Flight f = new Flight();
	BLManager bl=new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);
		
		String fid=request.getParameter("fid");
		int id=Integer.parseInt(fid);
		
		f=bl.serachbyflightid(id);
		
		Integer flightid=f.getFid();
		String fname=f.getFlightname();
		String source=f.getSource();
		String destination=f.getDestination();
		String duration=f.getDuration();
		Date date=(Date) f.getFlightdate();
		String ftime=f.getFlighttime();
		
		if(reg==null)
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('plz login first...');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}else
		{
			session.setAttribute("flightid",flightid);
			session.setAttribute("flightname",fname);
			session.setAttribute("source",source);
			session.setAttribute("destination",destination);
			session.setAttribute("duration",duration);
			session.setAttribute("fdate",date);
			session.setAttribute("ftime",ftime);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Welcome to booking section...');");
			out.println("location='booknowflight.jsp';");
			out.println("</script>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
