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
	<%
		String id =  request.getParameter("id");
		String password = request.getParameter("password");
		
		// 존재여부 확인 
		boolean logincheck = false;
		for( Member member : members ){
			if( member.getId().equals(id) && 
					member.getPassword().equals(password)){
				// 로그인 성공 
				logincheck = true;
					// 세션 생성
					session.setAttribute("loginid", member.getId() );
					// 세션 유지시간 
					//session.setMaxInactiveInterval(10);	// 초당 세션 유지시간
				response.sendRedirect("main.jsp");
			}
		}
		// 로그인 실패
		if( !logincheck ){ response.sendRedirect("login.jsp?result=fail"); } // rul요청 변수도 같이 이동
	%>
</body>
</html>








