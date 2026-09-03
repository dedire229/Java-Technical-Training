package com.raunak;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID= 1L;  
	
	public void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		
		// setting the content type of HTTP response
		res.setContentType("text/html");
		
		PrintWriter pWriter = res.getWriter();
		
		pWriter.println("<html><body>");
		pWriter.println("Welcome to my first servlet");
		pWriter.println("</body></html>");
		
		pWriter.close();
		
	}

}
