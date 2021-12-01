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
			// 1. 세션 할당 [ 쿠키와 달리 세션은 내장객체(미리 만들어진 객체)]
			session.setAttribute("id", "qweqwe");		// 세션저장소[ 톰캣 ]
			session.setAttribute("password", "123");
			
			// 2. 세션 생명주기[ 세션 호출이 없을때]
			session.setMaxInactiveInterval( 60 );	// 60초  [  기본값:30분 ]
			
		%>
		
		<p> 세션 만들기 </p>
		<p> <a href="13.세션테스트.jsp"> 확인 </a> </p>
		

</body>
</html>





