<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. ajax 통신된 데이터를 요청 
	String userid = request.getParameter("userid");
	// 2. Dao 아이디 체크 
	boolean result =  MemberDao.getmemberDao().idcheck(userid);
	if( result ){ 
		out.print("1"); // JSP 태그에서 html 에 작성하기
	}
	else{ 
		out.print("0"); 
	}

	// jsp 태그는 통신 결과로 반환X 
	// HTML 만 통신 결과로 반환O
%>