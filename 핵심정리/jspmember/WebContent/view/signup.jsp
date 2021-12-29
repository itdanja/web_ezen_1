<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- <form action="../controller/signupcontroller.jsp" method="post">
	아이디 : <input type="text" name="id">
	비밀번호 : <input type="password" name="password">
	이름 : 	<input type="text" name="name">
		<input type="submit" value="가입">
	</form> -->
	
	
	아이디 : <input type="text" name="id"> <button onclick="idcheck()">아이디체크</button>
	비밀번호 : <input type="password" name="password">
	이름 : 	<input type="text" name="name">
		<button onclick="signup();">가입</button>
	
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="../js/main.js"></script>
	
	
	
</body>
</html>