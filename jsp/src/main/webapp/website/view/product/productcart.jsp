<%@page import="dto.Login"%>
<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Login login =  (Login)session.getAttribute("login");
	String sname = "cart"+ login.getM_id();
	ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
	
	out.print( carts.get(0).getP_num() );
	out.print( carts.get(0).getP_size() );
	out.print( carts.get(0).getP_count() );
	
	%>

</body>
</html>