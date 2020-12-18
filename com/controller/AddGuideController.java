package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

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
import com.pojo.Registrationdata;
import com.pojo.Tourguide;

@WebServlet("/AddGuideController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 500)
public class AddGuideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private static final String SAV_DIR = "D:/OnlineTest/Travlling/WebContent/img/guide";
	
	Registrationdata reg = new Registrationdata();
	Tourguide t=new Tourguide();
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

		String gname = request.getParameter("gname");
		String gid = request.getParameter("gid");
		String cost = request.getParameter("cost");
		String gender = request.getParameter("gender");
		String mobno = request.getParameter("mobno");
		int rate=Integer.parseInt(cost);
		

		t.setRegistrationdata(reg);
		Part img = request.getPart("photo");

		try 
		{
			String Image1 = extractFileName(img);
			t.setGuidephoto(Image1);
			img.write(SAV_DIR + File.separator + Image1);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		t.setGuidename(gname);
		t.setGuideid(gid);
		t.setGuidecost(rate);
		t.setGender(gender);
		t.setPhoneno(mobno);
		
		
		bl.savedataguide(t);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Guide Added Successfully...');");
		out.println("location='addguide.jsp';");
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
