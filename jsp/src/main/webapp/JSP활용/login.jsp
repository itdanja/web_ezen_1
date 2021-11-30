<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="header.jsp" %>
	
	<h3> 로그인 페이지 </h3>
	<form action="logincontroller.jsp" method="post">
		아이디 : <input type="text" name="id" placeholder="Enter ID">
		비밀번호 : <input type="password" name="password" placeholder="Enter Password">
		<input type="submit" value="로그인"> 
	</form>

</body>
</html>







