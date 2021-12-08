<%@page import="dao.BoardDao"%>
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
	int r_num = Integer.parseInt( request.getParameter("r_num") );
	int b_num = Integer.parseInt( request.getParameter("b_num") );
	// db처리
	boolean result = BoardDao.getboarddao().replydelete(r_num);
	if( result ){
		out.print("<script>alert('댓글 삭제 되었습니다.');</script>");
		out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
	}else{
		out.print("<script>alert('댓글 삭제 오류[관리자에게문의].');</script>");
		out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
	}
%>

</body>
</html>