<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%

		// 1. 모든 쿠키를 가져오기 
		Cookie[] cookies = request.getCookies();
	
		if( cookies != null ){		
			for( int i = 0 ; i<cookies.length ; i++ ){
			
				if( cookies[i].getName().equals("mycookie") ){
					%>
						내 쿠키이름 : <%=cookies[i].getName() %>
						내 쿠키값 : <%=cookies[i].getValue() %>
					<%
				}
				
			}
			
		}
	%>

</body>
</html>