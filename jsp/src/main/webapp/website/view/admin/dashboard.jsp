<%@page import="dao.ProductDao"%>
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
	<%
		// 검색처리
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		ArrayList<Product> products = 
				ProductDao.getProductDao().getproductlist( key , keyword );
	%>
	<div class="container">
		
		<form action="dashboard.jsp" method="get" class="col-md-5 offset-3 input-group my-3"> <!-- 검색 -->
			<select class="custom-select col-md-3" name="key">
				<option value="p_num">제품번호</option> <option value="p_name">제품명</option>
				  <option value="p_category">카테고리</option> <option value="p_active">제품상태</option>
			</select>
			<input type="text" class="form-control" name="keyword">
			<input type="submit" class="btn btn-outline-info" value="검색">
		</form>
		<a href="productwrite.jsp"><button>제품등록</button></a> 
		<h3> 제품 목록 </h3>
		<table class="table">
			<tr> 
				<th> 이미지 </th><th>제품번호</th> <th>제품명</th><th>제품가격</th><th>카테고리</th>
				<th>상태</th><th>사이즈</th> <th>재고</th> <th>제품등록일</th> <th>비고</th>
			 </tr>
			 <%for( Product product : products  ){  %>
			 		<tr>
			 			<td width="100px;" height="100px;"><img src="../../upload/<%=product.getP_img() %>" style="max-width: 100%; max-height: 100%;"> </td>
			 			<td><%=product.getP_num() %></td> 
			 			<td><%=product.getP_name() %></td>
			 			<td><%=product.getP_price() %></td>
			 			<td><%=product.getP_category() %></td>
						<td><%=product.getactive() %></td>
						<td><%=product.getP_size() %></td> 
						<td><%=product.getP_stock() %></td> 
						<td><%=product.getP_date() %></td>
						<td>	<a href="#"> <button class="btn-outline-info">수정</button></a>  
								<a href="../../controller/productdeletecontroller.jsp?p_num=<%=product.getP_num() %>"> <button class="btn-outline-info">삭제</button></a>  
								<a href="#"> <button class="btn-outline-info" onclick="activeupdate(<%=product.getP_num()%>)">상태변경</button> </a>  
						</td>
			 		</tr>
			 <%	} %>
		</table>
		
	</div>
	
</body>
</html>







