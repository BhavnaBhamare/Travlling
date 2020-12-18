package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Cabs;
import com.pojo.Registrationdata;

@WebServlet("/DeleteCabs")
public class DeleteCabs extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	Registrationdata reg = new Registrationdata();
	Cabs c=new Cabs();
	BLManager bl=new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fid=request.getParameter("cabid");
		int cabid=Integer.parseInt(fid);
		
		c=bl.serachbycabid(cabid);
		
		bl.deletecab(c);
		
		response.sendRedirect("viewcab.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
