package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw=resp.getWriter();
		String userName=req.getParameter("un");
		String password=req.getParameter("Harshita");
		System.out.println("Welcome"+userName);
		pw.write("<h1>Welcome "+userName+"</h1>");
		if(password.equals("Harshita"))
		{
		pw.write("<h1>HTML"+password+"</h1>");
		}
		else
		{
			pw.write("<h1>Wrong Entry</h1>");
		}
}
}
