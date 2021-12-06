<%@page import="dto.Login"%>
<%@page import="dao.MemberDao"%>
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
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// DB 처리 
		boolean result =  MemberDao.getmemberDao().login(id, password);
		// DB 결과 
		if( result ){ // 로그인 성공시
			// 세션 부여 [ 내장객체 : 기본값(30분) ]
				// 회원번호 찾기
				int m_num = MemberDao.getmemberDao().getmembernum(id);
				// 로그인 객체 
				Login login = new Login( m_num , id );
				// 세션 
				session.setAttribute("login", login);
			response.sendRedirect("../view/main.jsp");
		} 
		else{ // 로그인 실패시
			response.sendRedirect("../view/member/login.jsp?result=fail");
		}
	%>
</body>
</html>









