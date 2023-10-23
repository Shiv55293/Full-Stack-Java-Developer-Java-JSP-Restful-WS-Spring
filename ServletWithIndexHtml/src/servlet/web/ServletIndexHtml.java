package servlet.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class ServletIndexHtml extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname = req.getParameter("name1");
		String myemail= req.getParameter("email1");
		
		System.out.println("Name : "+myname);
		System.out.println("Email : "+myemail);
		
		PrintWriter out = resp.getWriter();
		out.print("Name : "+myname);
		out.print("Email : "+myemail);	
	}
	
}
