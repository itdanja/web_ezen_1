<%@page import="java.util.Random"%>
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
	
	<%! // 선언문 : [ (필드) 멤버 변수 ]
		String[] 게임판 = {" "," "," "," "," "," "," "," "," " }; // 게임판 
	%>
	
	<%	// 스크립트문  메소드 [ javaService 메소드 내에서 실행 ]
		out.print( Arrays.toString( 게임판) ); 	// 확인 [ Arrays.toString : 배열 내용물 출력 ]
	%>
	<%
		// 사용자 선택 
		for( int i = 0 ; i<게임판.length ;i++ ){
			if( request.getParameter( i+"" ) !=null && request.getParameter(i+"").equals(i+"") && 게임판[i].equals(" ") ){
				out.print(i+"번 선택 !!! ");
				게임판[i] = "O";
				// 컴퓨터 난수 생성
				while(true){
					Random random = new Random();
					int com = random.nextInt(9);
					if( 게임판[com].equals(" ") ){ 게임판[com] = "X"; break; }
				}
			}
		}
	%>
	<form action="11.중간체크2.jsp" method="get">
		<% for( int i = 0 ; i<게임판.length; i++){ %>	<!-- 0부터 9까지 1씩증가 -->
		
			<button type="submit" value="<%=i %>" name="<%=i %>" > <%=i %>버튼 </button>
				<!-- type=전송  value="i번째 인덱스"	name="i번째 인덱스" -->	
			
			<!-- 3줄마다 줄바꿈 -->
			<% if( i % 3 == 2 ){ out.print("<br>"); }  %>
			
		<%} %>
	</form>
	
</body>
</html>







