<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 요청
	request.setCharacterEncoding("utf-8");	// 요청시[request] 한글 인코딩
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");
	String file = request.getParameter("file");
	// 작성자의 회원번호
	Login login =  (Login)session.getAttribute("login");
	int m_num = login.getM_num();
	// 객체화
	Board board = new Board( title , contents , m_num , file);
	// DB처리
	BoardDao.gemboarddao().boardwrite( board);
	
%>





