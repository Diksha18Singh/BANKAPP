package com.diksha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example2
 */
@WebServlet("/ADDAcc.do")
public class Example2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String title=request.getParameter("title");
		String Electric_Bill=request.getParameter("Electric_Bill");
		String Phone_Bill=request.getParameter("Phone_Bill");
		String Amount=request.getParameter("Amount");
		int r=Integer.parseInt(Amount);
		if(title==null )
		{
			//response.sendRedirect("Index.html");
			return;
		}
		if((r<=0) || ((r%1)==0))
		{
			System.out.print("Invalid amount");
			return;
		}
	
		
		
		
		
		PrintWriter out=response.getWriter();
		out.println("<h1> Your  = "+title+" Bill DETAILS</h1>");
		
		if(Electric_Bill==null)
		{
			out.println("<h2> From "+Phone_Bill);
		}
		else if(Phone_Bill==null)
		{
			out.println("<h2> From "+Electric_Bill);
		}
		
		out.println("<h2> Saved </h2>");
		out.close();
		
		doGet(request, response);
	}

}
