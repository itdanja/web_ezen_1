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
		String password = request.getParameter("password");	
	
		// 로그인된 아이디[세션]
		String id = (String)session.getAttribute("loginid"); 
		
		// 현재 세션에 있는 로그인 정보와 패스워드가 동일하면
		boolean result = MemberDao.getmemberDao().delete( id , password);
		
		if( result ){ // 탈퇴 성공시
			
			session.setAttribute("loginid" , null);
			out.print("<script>alert('회원탈퇴 되었습니다');</script>");
			out.println("<script>location.href='../view/main.jsp';</script>");
		
		
		}else{ // 탈퇴 실패시 
			
			out.print("<script> alert('회원정보가 다릅니다'); </script>");
			out.println("<script>location.href='../view/member/memberinfo.jsp';</script>");
	
		}
	%>
</body>
</html>