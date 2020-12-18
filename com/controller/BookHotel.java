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
import com.pojo.Flight;
import com.pojo.Hotel;
import com.pojo.Registrationdata;


@WebServlet("/BookHotel")
public class BookHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	Registrationdata reg = new Registrationdata();
	BLManager bl=new BLManager();
	Hotel h=new Hotel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);
		
		String hid=request.getParameter("hid");
		int id=Integer.parseInt(hid);
		
		h=bl.serachbyhotelid(id);
		
		Integer hotelid=h.getHid();
		String hname=h.getHotelname();
		String htype=h.getHoteltype();
		Integer rent=h.getRent();
		String hinfo=h.getHotelinfo();
		String address=h.getHoteladdress();
		
		if(reg==null)
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('plz login first...');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}else
		{
			session.setAttribute("hotelid",hotelid);
			session.setAttribute("hname",hname);
			session.setAttribute("htype",htype);
			session.setAttribute("rent",rent);
			session.setAttribute("hinfo",hinfo);
			session.setAttribute("address",address);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Welcome to booking section...');");
			out.println("location='booknowhotel.jsp';");
			out.println("</script>");
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
