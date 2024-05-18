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

@WebServlet("/savereg")
public class New_RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public New_RegistrationController() {
        super();
      
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/NewRegistration.jsp");
	rd.forward(request, response);
	
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id= Integer.parseInt(request.getParameter("id"));
	String name= request.getParameter("name");
	String course = request.getParameter("course");
	String email= request.getParameter("email");
	String mobile= request.getParameter("mobile");
	
	DAOService service= new DAOServiceImpl();
	service.connectDB();
	service.createRegistration(id, name, course, email, mobile);
	
	request.setAttribute("msg","your data is saved");
	RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/views/NewRegistration.jsp");
	rd.forward(request, response);
	
	}

}
