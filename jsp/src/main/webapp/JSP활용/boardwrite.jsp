<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "header.jsp" %>

	<h3> 게시물 쓰기 페이지 </h3>
	<form action="boardwritecontroller.jsp" method="post">
		제목 : <input type="text" name="title" placeholder="Enter title"> 	<br>
		내용 : <textarea rows="3" cols="10" name="contents"></textarea> 		<br>
		<input type="submit" value="작성">
	</form>

</body>
</html>








