package com.krawler;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		int k = i+j;
		
		//USING REQUEST DISPATCHER
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("/cube");
//		rd.forward(req, res);
		
		//USING REDIRECT
//		res.sendRedirect("cube?k="+k);
		
		//USING SESSION TO SEND DATA
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//USING COOKIE TO SEND DATA
		Cookie cooke = new Cookie("k", k+"");
		res.addCookie(cooke);
		
		res.sendRedirect("cube");
	}
}
