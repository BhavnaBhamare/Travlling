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
import com.pojo.Flight;
import com.pojo.Registrationdata;

@WebServlet("/AddFlightController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 500)

public class AddFlightController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private static final String SAV_DIR = "D:/OnlineTest/Travlling/WebContent/img/flight";

	Registrationdata reg = new Registrationdata();
	Flight f = new Flight();
	BLManager bl=new BLManager();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		reg=bl.serachbyemail(email);

		String fname = request.getParameter("fname");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String duration = request.getParameter("duration");
		String rate1 = request.getParameter("rate");
		String fdate = request.getParameter("fdate");
		String ftime = request.getParameter("ftime");
		int rate = Integer.parseInt(rate1);
		Date d=Date.valueOf(fdate);

		f.setRegistrationdata(reg);
		Part img = request.getPart("photo");

		try 
		{
			String Image1 = extractFileName(img);
			f.setFlightimg(Image1);
			img.write(SAV_DIR + File.separator + Image1);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		f.setFlightname(fname);
		f.setSource(source);
		f.setDestination(destination);
		f.setDuration(duration);
		f.setFlightrate(rate);
		f.setFlightdate(d);
		f.setFlighttime(ftime);
		
		bl.savedataflight(f);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Flight Added Successfully...');");
		out.println("location='addflight.jsp';");
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
