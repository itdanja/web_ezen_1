<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	System.out.print( userid );
	// Dao 아이디 체크 
	boolean result =  MemberDao.getmemberDao().idcheck(userid);
	if( result ){ 
		out.print("1"); // html 에 작성하기
	}
	else{ 
		out.print("0"); 
	}
%>