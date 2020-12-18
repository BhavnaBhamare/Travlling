package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/SearchFlightServ")
public class SearchFlightServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Registrationdata reg = new Registrationdata();
	Flight f = new Flight();
	BLManager bl=new BLManager();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		
	
		String fid = request.getParameter("fid");
		String date = request.getParameter("fdate");
		int id=Integer.parseInt(fid);
		Date fdate=Date.valueOf(date);
		
		f=bl.serachflightby(fdate,id);
		
		session.setAttribute("flight",f);
		
		response.sendRedirect("availableflight.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
