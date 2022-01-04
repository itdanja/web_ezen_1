

<%@page import="Model.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
/* 	String id = request.getParameter("id");
	String password = request.getParameter("password");
	boolean result = MemberDao.getmemberDao().login(id, password);
	if(result){
		response.sendRedirect("../view/main.jsp");
	} else{
		response.sendRedirect("../view/login.jsp");
	} */
	
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	boolean result = MemberDao.getmemberDao().login(id, password);
	if(result){
		out.print(1);
	} else{
		out.print(2);
	}
	
%>