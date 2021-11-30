<%@page import="java.io.FileInputStream"%>
<%@page import="Test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file ="header.jsp" %> <!-- 헤더페이지 포함 -->
	
	<h3> 메인 페이지 구역 </h3>
	
	<h4> 회원 현황 </h4>
	<%
		ArrayList<Member> members = new ArrayList<>();	// 1. 파일내 회원 객체를 저장할 리스트 	
		// 2. 파일입력스트림 선언
		FileInputStream fileInputStream 
		= new FileInputStream( "C:/Users/505-t/git/web_ezen_1/jsp/src/main/java/Test/memberlist.txt");
		byte[] bytes = new byte[100];	// 3. 읽어올 바이트를 저장할 바이트배열
		fileInputStream.read( bytes );	// 4. 파일 읽기 -> 바이트배열 저장
		String smember = new String(bytes);	// 5. 바이트배열 -> 문자열 변환 
		String[] ssmember = smember.split("\n"); // 6. 문자열 분해 [ \n ] : 회원구분
		for( int i = 0 ; i<ssmember.length-1 ; i++ ){ // 7. 마지막 \n 제외한 반복문
			// 객체화
			Member member = new Member( ssmember[i].split(",")[0] ,
										ssmember[i].split(",")[1] ,
										ssmember[i].split(",")[2] );
			members.add(member); // 리스트에 객체 저장
		}
	%>
	<table>
		<tr>
			<th> 번호 </th> <th> 아이디 </th> <th> 이름 </th>
		</tr>
		<%  for( int i = 0 ; i<members.size(); i++ ){  %>
				<tr>
					<td> <%=(i+1) %> </td>
					<td> <%=members.get(i).getId() %> </td>
					<td> <%=members.get(i).getName() %></td>
				</tr>
		<% } %>
		
	</table>
	
</body>
</html>










