<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int p_num = Integer.parseInt( request.getParameter("p_num") );
	int m_num = Integer.parseInt( request.getParameter("m_num") );
	out.print("제품번호:"+p_num+"회원번호:"+m_num);
	// db처리
	
%>