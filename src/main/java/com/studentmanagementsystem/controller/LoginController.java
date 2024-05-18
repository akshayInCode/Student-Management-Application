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

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		DAOService service= new DAOServiceImpl();
		service.connectDB();
		boolean status= service.verifyLogin(username, password);
		
		if(status) {
			RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/views/NewRegistration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error","Invalid username/password");
			RequestDispatcher rd=  request.getRequestDispatcher("/Login.jsp");
			rd.forward(request, response);
		}
		
	}

}
