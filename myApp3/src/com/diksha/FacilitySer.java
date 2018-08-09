package com.diksha;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FacilitySer
 */
@WebServlet("/FacilitySer")
public class FacilitySer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacilitySer() {
        super();
        // TODO Auto-generated constructor stub
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
		
		String balance=request.getParameter("balance");
		String pass=request.getParameter("pass");
		String pass1=request.getParameter("pass1");
		String AccoType=request.getParameter("AccoType");
		int bal=Integer.parseInt(balance);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		HttpSession session = request.getSession();
		
		int id = (int) session.getAttribute("cust_id");
		
		int customerId = AccountDOA.getIdFromCustID(id);
		
		FacilityDOA accDAO = new FacilityDOA();
		
		FacilityIn account = new FacilityIn();
		account.setAccno(customerId);
		account.setPaybal(bal);
		account.setDateofpay(timeStamp);
		account.setPaytype(pass);
		 
		accDAO.create(account);
		
		session.setAttribute("cust_id", customerId);
		System.out.println(customerId);
		System.out.println("<script type=\"text/javascript\">");
		System.out.println("alert('Your account creation is under processing... ');");
		System.out.println("location='facility.html';");
		System.out.println("</script>"); 
		
		
	}

}
