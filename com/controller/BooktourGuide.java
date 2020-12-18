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
import com.pojo.Hotel;
import com.pojo.Registrationdata;
import com.pojo.Tourguide;

@WebServlet("/BooktourGuide")
public class BooktourGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Registrationdata reg = new Registrationdata();
	BLManager bl=new BLManager();
	Tourguide t=new Tourguide();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);
		
		String hid=request.getParameter("tid");
		int tid=Integer.parseInt(hid);
		
		t=bl.serachbyguideid(tid);
		
		Integer tourid=t.getTid();
		String tname=t.getGuidename();
		String gender=t.getGender();
		Integer cost=t.getGuidecost();
		String phno=t.getPhoneno();
		
		if(reg==null)
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('plz login first...');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}else
		{
			session.setAttribute("tourid",tourid);
			session.setAttribute("tname",tname);
			session.setAttribute("gender",gender);
			session.setAttribute("cost",cost);
			session.setAttribute("phno",phno);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Welcome to booking section...');");
			out.println("location='booknowguide.jsp';");
			out.println("</script>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
