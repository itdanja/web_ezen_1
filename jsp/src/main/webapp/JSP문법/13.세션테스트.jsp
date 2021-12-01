<%@page import="java.util.Enumeration"%>
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
		// 1. 하나의 세션 호출 
		out.print( session.getAttribute("id") );
		// 2. 여러개의 세션 호출[ getAttributeNames -> 반환타입(Enumeration인터페이스) ]
				// * Enumeration : 리스트 혹은 배열의 항목들을 순회
		Enumeration enumeration = session.getAttributeNames();
		
		while( enumeration.hasMoreElements() ){
						// hasMoreElements : 다음 항목 존재여부 확인 
			String name = (String)enumeration.nextElement();
						// nextElement : 다음 항목 가져오기
						// 쿠키의 이름 하나 가져오기
			String value = (String)session.getAttribute(name);
						// 가져온 쿠키이름의 세션 데이터 호출
			out.println("<br> 세션이름 : " + name + "<br> 세션 값은 : " + value);
				
		}
		
	%>

</body>
</html>