package com.cts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	public class SecondFilter implements Filter{
		String name,name2;
		@Override
		public void init(FilterConfig arg0) throws ServletException {
			System.out.println("from init of SecondFilter");

		}
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			name=request.getParameter("un");
			name2=name.toUpperCase();
			if(name.equals(name2))
			{
				chain.doFilter(request, response);
			}
			else
			{
				response.getWriter().write("<h1>Invalid username</h1>");
			}
		}
		@Override
		public void destroy() {
			// TODO Auto-generated method stub

		}
	}
}