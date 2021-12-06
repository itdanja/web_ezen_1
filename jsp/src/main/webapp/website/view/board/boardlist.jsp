<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
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

	
	<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
	
	<!-- 고객센터 페이지 -->
	<div class="container">
	
		<a href="boardwrite.jsp"><button>글쓰기 </button></a>
		
		<table>
			<tr>
				<th> 번호 </th>
				<th> 제목 </th>
				<th> 작성자</th>
				<th> 작성일 </th>
				<th> 조회수 </th>
			</tr>
			<%
				ArrayList<Board> boards = 
					BoardDao.getboarddao().boardlist();
			
				for( Board board : boards ){
			%>
				<tr>
					<td><%=board.getB_num() %></td>
					<td><a href="boardview.jsp?b_num=<%=board.getB_num()%>"><%=board.getB_title() %></a></td>
							<!-- 게시물 상세페이지 이동 [ 클릭한 게시물 번호 요청 ] -->
					<td><%=board.getM_num() %></td>
					<td><%=board.getB_date() %></td>
					<td><%=board.getB_view() %></td>
				</tr>
			
			<%
				}
			%>
		</table>
	</div>

</body>
</html>






