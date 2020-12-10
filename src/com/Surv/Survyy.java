package com.Surv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LoginValidation.Validation;


@WebServlet("/Survyy")
public class Survyy extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String username = req.getParameter("username");
		String userpass = req.getParameter("userpass");
		
		HttpSession session = req.getSession();
		session.setAttribute("storedusername", username);
		
		System.out.println(username + ", " + userpass);
		
		Validation ourcheck = new Validation();
		try {
			if (ourcheck.Data(username, userpass)) {	
				response.sendRedirect("page1.jsp");
				
			} else {
				req.setAttribute("message", "Invalid first name and/or password.");
				RequestDispatcher dispatch = req.getRequestDispatcher("/index.jsp");
				dispatch.forward(req, response);
				//response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
