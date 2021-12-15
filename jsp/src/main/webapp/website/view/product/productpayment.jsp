<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
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

	<%@include file ="../header.jsp" %>
	<!-- 결제API [ 아임포트 ] 가져오기  -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	
	<%
		String sname = "cart"+loginid;
		ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
	
		// 총 제품 금액 
		int totalprice = 0; 
		
		for( Cart cart : carts ){
			Product product = ProductDao.getProductDao().getproduct( cart.getP_num());
			totalprice+= cart.getP_count()*product.getP_price();
		}
		
		
	%>
		<input id="totalprice" value="<%=totalprice %>">
	
	
	<div class="container">
		<button onclick="payment();">카드결제</button>
	</div>
</body>
</html>









