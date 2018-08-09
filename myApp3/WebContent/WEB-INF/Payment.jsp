<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.diksha.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div id="main">
	<%
		Integer accNo = (Integer)session.getAttribute("AccNo");
		
		String billType = request.getParameter("billType");
		String provider = request.getParameter("provider");
		FacilityDAO facpay = new FacilityDAO();
		FacilityPayment facpayobject = new FacilityPayment(accNo, billType, provider);
		facpay.create(facpayobject);
		out.println("<script type=\"text/javascript\">");
	    out.println("alert('Your prefrence have been added successfully... ');");
	    out.println("</script>");
	    
	    List<FacilityPayment> facpaylist = FacilityPaymentDAO.getDataFromAccNo(accNo);
	    Iterator<FacilityPayment> it= facpaylist.iterator();
	    out.println("<table>");
	    out.println("<tr><td>Bill Type</td><td>Provider</td></tr>");
		while(it.hasNext()){
			out.println("<tr><td>"+it.next().getBillType()+"</td><td>"+it.next().getProvider()+"</td></tr>");
		} 
		out.println("</table>");
	%>
	<hr />
	<p><strong>Bill Type: </strong><%=billType %></p>
	<p><strong>Provider: </strong><%=provider %></p>
	
</div>

</body>
</html>