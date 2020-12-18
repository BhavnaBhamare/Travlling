package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Hotel;

/**
 * Servlet implementation class DeleteHotel
 */
@WebServlet("/DeleteHotel")
public class DeleteHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	BLManager bl=new BLManager();
	Hotel h=new Hotel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String hid=request.getParameter("hid");
		int id=Integer.parseInt(hid);
		
		h=bl.serachbyhotelid(id);
		
		bl.deletehotel(h);
		
		response.sendRedirect("viewhotel.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
