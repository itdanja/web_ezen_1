<%@page import="dto.Login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Cart"%>
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
		// 선택한 제품의 제품번호 , 옵션 , 수량
		int p_num = Integer.parseInt(request.getParameter("p_num") );
		String p_size = request.getParameter("p_size");
		int p_count = Integer.parseInt(request.getParameter("p_count") );
		// 객체화
		Cart cart = new Cart( p_num , p_size , p_count );
		// 리스트 
		ArrayList<Cart> carts = new ArrayList<>();
		carts.add( cart );
		// 세션에 저장[ 이름 : cart+아이디  값 : cart리스트 ]
		Login login =  (Login)session.getAttribute("login");	// 세션 자료형/클래스 는 object
		String sname = "cart"+ login.getM_id();
		session.setAttribute(sname, carts);
		
		response.sendRedirect("../view/product/productcart.jsp");
		
	%>

</body>
</html>




