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
	���̵� : <input type="text" name="id">
	��й�ȣ : <input type="password" name="password">
	�̸� : 	<input type="text" name="name">
		<input type="submit" value="����">
	</form> -->
	
	
	���̵� : <input type="text" name="id"> <button onclick="idcheck()">���̵�üũ</button>
	��й�ȣ : <input type="password" name="password">
	�̸� : 	<input type="text" name="name">
		<button onclick="signup();">����</button>
	
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="../js/main.js"></script>
	
	
	
</body>
</html>