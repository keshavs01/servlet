package com.krawler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class CubeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req2, HttpServletResponse res2) throws IOException {
		
		int k = 0;
		//USING REDIRECT
//		k = Integer.parseInt(req2.getParameter("k"));

		//USING SESSION TO SEND DATA
//		HttpSession session2 = req2.getSession();
//		k = (int)session2.getAttribute("k");
		
		//USING COOKIE TO SEND DATA
		Cookie cookie2[] = req2.getCookies();
		for( Cookie c : cookie2) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		PrintWriter pw = res2.getWriter();
		pw.println("Cube of number " + k + " = " +(k*k*k));
	}

}
