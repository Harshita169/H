package com.cts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	public void task2() {
		System.out.println("Task2");

	}
	@Override
	public void init() throws ServletException {
		System.out.println("From init method");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From service method");
		task2();
	}
	public MyServlet() {
		System.out.println("from constructor");
	}
	@Override
	public void destroy() {
		System.out.println("From destroy method");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}
