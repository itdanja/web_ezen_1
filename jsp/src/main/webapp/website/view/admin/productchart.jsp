<%@page import="dto.Product"%>
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

	<%@include file="../header.jsp" %>
	
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h6> 주문 그래프 </h6>
				<canvas id="myChart"></canvas>
			</div>
			<div class="col-md-6">
				<h6> 제품별 총판매량 </h6>
				<canvas id="productchart"></canvas>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<h6> 제품별 판매추이 </h6>
				<select class="form-control" onchange="pchange()" id="pselect">
					<option>제품명선택</option>
					<% ArrayList<Product> products 
							= ProductDao.getProductDao().getproductlist(null, null);%>
					<%for( Product temp : products ){ %>
						<option value="<%=temp.getP_num()%>"><%=temp.getP_name() %></option>
					<%} %>
				</select>
				<canvas id="productdatechart"></canvas>
			</div>
			<div class="col-md-6">
				<h6> 제품별 판매량 </h6>
			</div>
		</div>
	</div>
	
</body>
</html>



