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
		session.setAttribute("login", null); // 로그인 세션 초기화
		response.sendRedirect("../view/main.jsp");
	%>

</body>
</html>