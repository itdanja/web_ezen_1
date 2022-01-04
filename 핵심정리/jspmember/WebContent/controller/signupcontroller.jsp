
<%@page import="Model.MemberDto"%>
<%@page import="Model.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 

	
	/* String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	
	boolean idcheck =MemberDao.getmemberDao().ldcheck(id);
	if(idcheck){
		response.sendRedirect("../view/signup.jsp");
	}else{
		MemberDto memberDto = new MemberDto(id, password, name);
		boolean result = MemberDao.getmemberDao().signup(memberDto);
		if(result) {
			response.sendRedirect("../view/login.jsp");
		}else {
			response.sendRedirect("../view/signup.jsp");
		}
		
	} */
	
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	
	MemberDto memberDto = new MemberDto(id, password, name);
	boolean result = MemberDao.getmemberDao().signup(memberDto);
	if(result) {
		out.print(1);
	}else {
		out.print(2);
	}

%>