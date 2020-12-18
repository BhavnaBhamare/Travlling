package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Flight;

@WebServlet("/DeleteFlight")
public class DeleteFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	Flight f=new Flight();
	BLManager bl=new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fid=request.getParameter("fid");
		int id=Integer.parseInt(fid);
		
		f=bl.serachbyflightid(id);
		
		bl.deleteflight(f);
		
		response.sendRedirect("viewflight.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
