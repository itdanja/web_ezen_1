<%@page import="dto.Reply"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Login"%>
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
	String contents =request.getParameter("contents");
	int  b_bum = Integer.parseInt( request.getParameter("b_num"));
	// 로그인된 회원의 번호
	Login login = (Login)session.getAttribute("login");
	int m_num = login.getM_num();
	
	// 객체화 
	Reply reply  = new Reply( contents , m_num , b_bum);
	
	// db처리
	boolean result =  BoardDao.getboarddao().replywrite(reply);
	if( result ){// 결과
		out.print("<script>alert('댓글 등록 되었습니다.');</script>");
		out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_bum+"';</script>");
	}else{
		out.print("<script>alert('댓글 등록 오류[관리자에게문의].');</script>");
		out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_bum+"';</script>");
	}
	
			
	
%>

</body>
</html>