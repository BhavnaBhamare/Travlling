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
import com.pojo.Hotel;
import com.pojo.Registrationdata;

@WebServlet("/AddHotelController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 500)
public class AddHotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAV_DIR = "D:/OnlineTest/Travlling/WebContent/img/hotel";
    
	Registrationdata reg = new Registrationdata();
	BLManager bl=new BLManager();
    Hotel h=new Hotel();	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);

		String hname = request.getParameter("hname");
		String htype = request.getParameter("htype");
		String rent = request.getParameter("rent");
		String hinfo = request.getParameter("hinfo");
		String address = request.getParameter("address");
		int rate=Integer.parseInt(rent);
		

		h.setRegistrationdata(reg);
		Part img = request.getPart("photo");

		try 
		{
			String Image1 = extractFileName(img);
			h.setHotelimage(Image1);
			img.write(SAV_DIR + File.separator + Image1);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		h.setHotelname(hname);
		h.setHoteltype(htype);
		h.setRent(rate);
		h.setHotelinfo(hinfo);
		h.setHoteladdress(address);
		
		bl.savedatahotel(h);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Hotel Added Successfully...');");
		out.println("location='addhotel.jsp';");
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
