<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int b_num = Integer.parseInt(request.getParameter("b_num"));
	
	//db처리
	boolean result = BoardDao.getboarddao().boarddelete(b_num);
	
	if( result ){
		out.print("<script>alert('삭제 되었습니다.');</script>");
		out.println("<script>location.href='../view/board/boardlist.jsp';</script>");
		//response.sendRedirect("../view/board/boardlist.jsp");
			// 1. out.print 2. response [ 페이지 전환 ] 3. alert   [ X ]
			// 1. out.print 2. alert , location.href [O]
			
	}else{
		response.sendRedirect("../view/board/boardview.jsp?b_num="+b_num);		
	}

%>