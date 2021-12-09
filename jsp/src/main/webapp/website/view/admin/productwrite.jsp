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
	
		<form action="../../controller/productwritecontroller.jsp" method="post" enctype="multipart/form-data">
			제품명 : <input type="text" name="p_name"> <br>
			가격 : <input type="text" name="p_price">  <br>
			제조사 : <input type="text" name="p_manufacturer"> <br>
			카테고리 : <select name ="p_category">  
					<option value="top"> top </option>
					<option value="pants"> pants </option>
					<option value="outer"> outer </option>
				</select>
			제품상태 : <select name ="p_active">
					<option value="1"> 준비중 </option>
					<option value="2"> 판매중 </option>
					<option value="3"> 품절 </option>
				</select>
			제품사이즈 : <select name ="p_size">
					<option value="S"> S </option>
					<option value="M"> M </option>
					<option value="L"> L </option>
				</select>  <br>
			제품재고 : <input type="text" name="p_stock">   <br>
			제품이미지 : <input type="file" name="p_img">  <br>
			제품내용 : <textarea rows="" cols="" name="p_contents"></textarea>  <br>
			<input type="submit" value="제품등록">
		</form>
		
	
	</div>
	
	

</body>
</html>