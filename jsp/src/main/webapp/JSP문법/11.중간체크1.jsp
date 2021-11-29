<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%	// 스크립트 태그 [ java코드를 작성할수잇는 공간]
		Calendar calendar = Calendar.getInstance();		// 현재 날짜,시간
			int year = calendar.get( Calendar.YEAR );	// 현재 연도
			int month = calendar.get(Calendar.MONTH)+1;	// 현재 월 [ 1월:0 ~~ 12:11]
		calendar.set( year , month-1 , 1 ); 	// 현재 월의 1일 설정
		int sweek = calendar.get( Calendar.DAY_OF_WEEK );		// 요일찾기 2 : 월요일
		int eday = calendar.getActualMaximum( calendar.DAY_OF_MONTH );	// 현재 월의 마지막 => 30
	%>

	<h1> <%=year %>년  <%=month %>월 달력 [ day12-5 ] </h1>

	<table border="1">
		<thead>
			<tr>
				<th> 일요일 </th> <th> 월요일 </th>  <th> 화요일 </th>  
				<th> 수요일 </th>  <th> 목요일 </th>  <th> 금요일 </th>  <th> 토요일 </th>
			</tr>
		</thead>
		<tbody>
			<!-- for 구역 -->
			<tr>
				<% for( int i = 1 ;  i<sweek ; i++ ){ %>
					<td> </td>
				<%} %>
				<% for( int i = 1 ; i<=eday ; i++ ){ %>
					<td> <%=i %> </td>
				<% } %>
			</tr>
		</tbody>	
	</table>

</body>
</html>




