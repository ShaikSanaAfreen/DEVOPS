package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.LoginPojo;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// PrintWriter out = response.getWriter();
		String s1 = request.getParameter("username");

		String s2 = request.getParameter("password");
//RequestDispatcher requestDispatcher=null;
//requestDispatcher = request.getRequestDispatcher("Result1.jsp");
		LoginPojo loginpojo = new LoginPojo();
		loginpojo.setUsername(s1);
		loginpojo.setPassword(s2);
		LoginService loginService = new LoginService();
		LoginPojo returnLoginPojo = loginService.validateLogin(loginpojo);

//request.setAttribute("result", result);
		if (returnLoginPojo.getRole() == null) {

//request.setAttribute("error", "Invalid username/password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Invalid username/password");
			requestDispatcher.forward(request, response);
		}

		/*
		 * if (s1.equals("admin") && s2.equals("admin")) {
		 * //requestDispatcher=request.getRequestDispatcher("success.html");
		 * request.setAttribute("result","success"); }
		 */
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result.jsp");
			request.setAttribute("loginDetails", loginpojo);
			requestDispatcher.forward(request, response);
		}

	}

}