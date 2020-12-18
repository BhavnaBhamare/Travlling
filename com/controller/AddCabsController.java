package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.model.BLManager;
import com.pojo.Cabs;
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/AddCabsController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 500)

public class AddCabsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAV_DIR = "D:/OnlineTest/Travlling/WebContent/img/cabs";
	
	Registrationdata reg = new Registrationdata();
	Cabs c=new Cabs();
	BLManager bl=new BLManager();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);

		String cname = request.getParameter("cname");
		String dname = request.getParameter("dname");
		String cabtype = request.getParameter("cabtype");
		String rent = request.getParameter("rent");
		String cabno = request.getParameter("cabno");
		String mobno = request.getParameter("mobno");
		

		c.setRegistrationdata(reg);
		Part img = request.getPart("photo");

		try 
		{
			String Image1 = extractFileName(img);
			c.setCabimg(Image1);
			img.write(SAV_DIR + File.separator + Image1);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		c.setCabname(cname);
		c.setDrivername(dname);
		c.setCabtype(cabtype);
		c.setPackage_(rent);
		c.setCabno(cabno);
		c.setPhoneno(mobno);
		
		
		
		bl.savedatacabs(c);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Cabs Added Successfully...');");
		out.println("location='addcab.jsp';");
		out.println("</script>");
		
	}
	       

	private String extractFileName(Part img) 
	{
		String contentDisp = img.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

}
