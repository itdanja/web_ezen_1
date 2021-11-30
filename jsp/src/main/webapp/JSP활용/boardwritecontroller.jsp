<%@page import="java.io.FileOutputStream"%>
<%@page import="Test.Board"%>
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
		//1. 입력받은 변수 요청
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		// 2. 객체화
		Board board = new Board( title , contents , (String)session.getAttribute("loginid") );
		// 3. 파일처리
		FileOutputStream fileOutputStream = 
		new FileOutputStream("C:/Users/505-t/git/web_ezen_1/jsp/src/main/java/Test/boardlist.txt" , true );
		String outstring = board.getTitle()+","+board.getContents()+","+board.getWriter()+"\n";
		fileOutputStream.write( outstring.getBytes() );
		// 4. 성공시 
		response.sendRedirect("boardlist.jsp");
		
	%>

</body>
</html>






