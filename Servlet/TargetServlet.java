package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SourceServlet
 */
@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("From doGet of TargetServlet");
	String customerName=(String)req.getAttribute("customerName");
	Integer term=(Integer)req.getAttribute("noOfYears");
	Integer premiumAmount=(Integer)req.getAttribute("amount");
	double sumAssured=(premiumAmount*term)+(premiumAmount*term)*20/100;
	System.out.println("Amount after Maturity="+sumAssured);
	PrintWriter pw=resp.getWriter();
	pw.write("<h1>Amount after Maturity &nbsp;&nbsp;"+(sumAssured*term)+"</h1>");
	
	}
	
}