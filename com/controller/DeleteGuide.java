package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Registrationdata;
import com.pojo.Tourguide;

@WebServlet("/DeleteGuide")
public class DeleteGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Registrationdata reg = new Registrationdata();
	Tourguide t=new Tourguide();
	BLManager bl=new BLManager();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String tid=request.getParameter("tid");
		int id=Integer.parseInt(tid);
		
		t=bl.serachbyguideid(id);
		
		bl.deleteguide(t);
		
		response.sendRedirect("viewguide.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
