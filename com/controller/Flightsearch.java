package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/Flightsearch")
public class Flightsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Registrationdata reg = new Registrationdata();
	Flight f = new Flight();
	BLManager bl=new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String fid = request.getParameter("fid");
		int id=Integer.parseInt(fid);
		
		f=bl.serachbyflightid(id);
		
		session.setAttribute("fid",f);
		
		response.sendRedirect("flightsearch.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
