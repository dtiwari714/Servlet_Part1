package com.servlests;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlets implements Servlet {
	// Life cycle method

	ServletConfig conf;

	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object");
	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("servicing......");
		// set the conntent type of response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("this is servlet" + new Date().toString());

	}

	public void destroy() {
		System.out.println("Going to destroy servlet object");
	}

	//// non life cycle method
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	public String getServletInfo() {
		return "This is  created by Durgesh";

	}

}
