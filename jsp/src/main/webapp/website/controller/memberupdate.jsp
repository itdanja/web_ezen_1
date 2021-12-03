<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	// 로그인된 아이디[ 세션 ]
	String id = (String)session.getAttribute("loginid");

	// ajax로부터 요청한 변수	
	String newname = request.getParameter("newname");
	String newsex = request.getParameter("newsex");

	// name db처리
	if( newname != null  ){
		if(MemberDao.getmemberDao().update( "m_name" ,  newname, id) ){
			out.print("1");
		}else{
			out.print("0");
		}
	}
	// sex db처리
	if( newsex != null  ){
		if( MemberDao.getmemberDao().update( "m_sex" ,  newsex, id) ){
			out.print("1");
		}else{
			out.print("0");
		}
	}
	


%>