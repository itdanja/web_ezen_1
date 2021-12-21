
<%@page import="dao.PorderDao"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String type = request.getParameter("type");

	 JSONObject jsonObject = new JSONObject();
	// JSONObject <--> Map 
		// JSONObject.put( 키 : 값 ) : 엔트리 추가  
	//jsonObject.put( "id" , "qweqwe" );
	//jsonObject.put( "password" , "qweqwe" );
	if( type.equals("1") ){
		jsonObject = PorderDao.getPorderDao().getorderdatecount();
	}else if( type.equals("2")){
		
	}
	
%>
<%=jsonObject%>


