package com.Registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LoginValidation.Validation;

@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest requ, HttpServletResponse respo) throws ServletException, IOException {
		String regname = requ.getParameter("regname");
		String regsurname = requ.getParameter("regsurname");
		int regage = Integer.parseInt(requ.getParameter("regage"));
		String regemail = requ.getParameter("regemail");
		String regpassword = requ.getParameter("regpassword");
		
		Validation dbstorage = new Validation();
		try {
			dbstorage.DataStorage(regname, regsurname, regage, regemail, regpassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		respo.sendRedirect("index.jsp");
	}

}
