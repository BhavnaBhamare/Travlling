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
import com.pojo.Cabs;
import com.pojo.Registrationdata;

@WebServlet("/BookNowCab")
public class BookNowCab extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Registrationdata reg = new Registrationdata();
	BLManager bl=new BLManager();
	Cabs c=new Cabs();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);
		
		String hid=request.getParameter("cabid");
		int cabid=Integer.parseInt(hid);
		
		c=bl.serachbycabid(cabid);
		
		Integer cid=c.getCabid();
		String cname=c.getCabname();
		String cno=c.getCabno();
		String pack=c.getPackage_();
		String drivername=c.getDrivername();
		String cabtype=c.getCabtype();
		String mobno=c.getPhoneno();
		
		if(reg==null)
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('plz login first...');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}else
		{
			session.setAttribute("cid",cid);
			session.setAttribute("cname",cname);
			session.setAttribute("cno",cno);
			session.setAttribute("pack",pack);
			session.setAttribute("drivername",drivername);
			session.setAttribute("cabtype",cabtype);
			session.setAttribute("mobno",mobno);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Welcome to booking section...');");
			out.println("location='booknowcab.jsp';");
			out.println("</script>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
