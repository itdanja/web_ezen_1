<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
	
	<!-- 글쓰기 페이지  -->
	<div class="container">
		<form action="../../controller/boardwritecontroller.jsp" method="post">
			제목 : <input type="text" name="title"> <br>
			내용 : <textarea rows="10" cols="20" name="contents"></textarea> <br>
			첨부파일 : <input type="file" name="file"> <br>
			<input type="submit" value="등 록">
		</form>
	</div>
</body>
</html>









