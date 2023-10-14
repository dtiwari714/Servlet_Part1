package com.servlests;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HttpServlet extends jakarta.servlet.http.HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		System.out.println("Http Request servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("HttpServlet request");
	}

}
