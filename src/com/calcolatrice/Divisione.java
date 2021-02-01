package com.calcolatrice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Divisione
 */
@WebServlet("/Divisione")
public class Divisione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Divisione() {
        super();
        // TODO Auto-generated constructor stub
    }
    private static double dividiNumeri(double a,double b) {
		double s;
		s=a/b;
		
		return s;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
		double valore1 = Double.parseDouble((request.getParameter("valore1")));
		double valore2 = Double.parseDouble((request.getParameter("valore2")));
		double result = dividiNumeri(valore1,valore2);


	    request.setAttribute("result", result); // It'll be available as ${sum}.
	    request.getRequestDispatcher("calcolatrice.jsp").forward(request, response);
		
		
		}
		catch(NumberFormatException e) {
			System.err.println("non � un numerooo");
			
		}
		}

}
