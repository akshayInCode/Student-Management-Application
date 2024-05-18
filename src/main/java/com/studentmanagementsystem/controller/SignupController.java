package com.studentmanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentmanagementsystem.model.DAOService;
import com.studentmanagementsystem.model.DAOServiceImpl;

@WebServlet("/sign")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		DAOService service = new DAOServiceImpl();
		service.connectDB();
		try {
			if (service.isUsernameExists(username)) {
				request.setAttribute("msg", "Username already exists. Please choose another username.");
			} else {
				service.Signup(name, username, password);
				request.setAttribute("msg", "Your signup is successful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "An error occurred during signup. Please try again.");
		}

		RequestDispatcher rd = request.getRequestDispatcher("/Signup.jsp");
		rd.forward(request, response);

	}

}
