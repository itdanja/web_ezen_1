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
		request.setCharacterEncoding("utf-8");
		String string = request.getParameter("string");
		int count = Integer.parseInt(request.getParameter("count"));
	
		for( int i = 0 ; i<count; i++){
		
			out.print(i+"번째 : " + string+"<br>");
			
		}
	%>
	
	

</body>
</html>