package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Register;

/**
 * Servlet implementation class getRegisterServlet
 */
@WebServlet("/getRegisterServlet")
public class getRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String orderCost = request.getParameter("orderCost");
		String userAmount = request.getParameter("userAmount");
		
		Register userReg = new Register(Double.parseDouble(orderCost), Double.parseDouble(userAmount));
		
		request.setAttribute("userRegInfo", userReg);
		getServletContext().getRequestDispatcher("/RegisterResult.jsp").forward(request, response); 
	}

}
