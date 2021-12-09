<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	boolean result =  ProductDao.getProductDao().activeupdate(
			Integer.parseInt(request.getParameter("p_num") ) );
	if( result )out.print("1");
	else out.print("2");
	
%>