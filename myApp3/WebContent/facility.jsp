<%@page import="com.diksha.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility</title>
<link rel="stylesheet" type="text/css" href="StylingCss/default.css">
<script src="jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="main">
	<h1>Bill Payment Form </h1><hr/>
	<!-- <p>Customer Id:
		<%
			Integer customerId = (Integer) session.getAttribute("cust_id");
			out.println(customerId);
		%>
	</p>-->
	<p><strong>
		Account Number :
		<%
		int accNumber = AccountDAO.getIdFromCustID(customerId);
		out.println(accNumber);
		session.setAttribute("AccNo", accNumber);
		%>
	</strong></p>
	<form action="facilitiesPayment.jsp" method="GET">
	<!--Select your Bill : <input onClick="displayOnClick();" type="radio" name="billType" value="Electric Bill"/>Electric Bill <input  onclick="displayOnClick();" type="radio" name="billType" value="Phone Bill"/>Phone Bill<br />-->
	Select your Bill :
	<select name="billType" id="billTypes">
		<option value="" selected id="default"></option>
		<option value="Electric" id="electricOptn">Electric Bill</option>
		<option value="Phone" id="phoneOptn">Phone Bill</option>
	</select><br/><br />
	Select Provider :
	<div id="elect" style="display:none;">
	For Electricity Bill : 
	<select name="provider">
		<option value="" selected class="default"></option>
  		<option value="MSEB" class="providerOptn">MSEB</option>
  		<option value="Tata" class="providerOptn">Tata</option>
  		<option value="Reliance" class="providerOptn">Reliance</option>
	</select> 
	</div>
	<div id="phone" style="display:none;">
	For Phone Bill :
	<select name="provider">
		<option value="" selected class="default"></option>
  		<option value="MTNL" class="providerOptn">MTNL</option>
  		<option value="Jio" class="providerOptn">Jio</option>
  		<option value="Airtel" class="providerOptn">Airtel</option>
  		<option value="Vodafone" class="providerOptn">Vodafone</option>
  		<option value="Idea" class="providerOptn">Idea</option>  		
	</select> 
	</div>	
	<br/><br />
	<input type="submit" value="Submit">	
	</form>	
</div>

<script>

		var electric = document.getElementById("electricOptn");
		electric.addEventListener("click", function(){
			document.getElementById("elect").style.display="block";
			document.getElementById("phone").style.display="none";
		}, false);
		
		var phone = document.getElementById("phoneOptn");
		phone.addEventListener("click", function(){
			document.getElementById("elect").style.display="none";
			document.getElementById("phone").style.display="block";
		}, false);

</script>
</body>
</html>