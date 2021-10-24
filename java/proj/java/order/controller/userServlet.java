package proj.java.order.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import proj.java.order.dao.userDao;
import proj.java.order.model.user;

@WebServlet("/order")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private userDao userdao = new userDao();
     /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/orderdetails.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String bookey = request.getParameter("bookey");
			String delivery = request.getParameter("delivery");
			String address = request.getParameter("address");
			String contact = request.getParameter("contact");

			user use = new user();
			use.setFirstName(firstName);
			use.setLastName(lastName);
			use.setBookey(bookey);
			use.setDelivery(delivery);
			use.setContact(contact);
			use.setAddress(address);
        
        try {
			userdao.registerUser(use);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/orderregister.jsp");
		dispatcher.forward(request, response);
	}

}
