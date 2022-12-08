package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bean;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("view/loggedin.jsp");
		rd.forward(request, response);
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		
		String UserName = request.getParameter("username");
		String PassWord = request.getParameter("password");
		
		String user1= "albin";
		String pass1= "malin";
		
		String user2= "malin";
		String pass2= "albin";
		
		if((UserName.equals(user1) && PassWord.equals(pass1))|| (UserName.equals(user2) && PassWord.equals(pass2))){
			Bean user = new Bean ();
			user.setUsername(user1);
			user.setPassword(pass1);
		
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("LoggedIn", user);
			RequestDispatcher rd = request.getRequestDispatcher("view/loggedin.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("Wrong", "Wrong");
			request.getRequestDispatcher("view/index.jsp").forward(request, response);
			
			
			
			
			
			
		}
		
		
		
		
		
	
	}

}
