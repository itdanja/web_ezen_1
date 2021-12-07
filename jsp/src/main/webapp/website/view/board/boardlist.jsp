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
	
		<div class="text-center">
			<h3 style="border-bottom: solid 1px #eeeee;"> 고객센터 </h3>
			<br>
			<p style="color: orange;"> · 벤츠에 가입하시면 다양한 이벤트를 제공 받을수 있습니다. · </p>
		</div>
		
		<div class="text-center">
			
			<div class="row">
				<div class="col-md-5  m-2">
					<h4>·자주 묻는 질문</h4>
					<table class="table ">
						<tr>	<td> Q </td> <td> 아이디를 분실했습니다 </td> </tr>
						<tr>	<td> Q </td> <td> 아이디를 분실했습니다 </td> </tr>
						<tr>	<td> Q </td> <td> 아이디를 분실했습니다 </td> </tr>
						<tr>	<td> Q </td> <td> 아이디를 분실했습니다 </td> </tr>
					</table>
				</div>
				<div class="col-md-6 align-middle">
						<h4> ·고객 문의 </h4> <br><br>
						<h1 class="text-success">1577-7011</h1> <br> <h6>365일 24시간 운영</h6>
				</div>
			</div>
		</div>
		<hr>
		<br> <br>
		<h4> ·문의 게시판 </h4>
				<div class="row">
					
				<%
					if( loginid != null ){ // null값은 equals 불가
				%>
					<div class="col-md-2 offset-10" >
						<a href="boardwrite.jsp"><button type="button" class="form-control">글 등록</button></a>
					</div>
				
				<%	}else{ %>
					<div class="col-md-3 offset-9" >
					* 로그인후에 글 등록 가능 합니다.
					</div>
				<%}%>
				</div>
				<br>
		<table class="table">
			<tr>
				<th> 번호 </th>
				<th> 제목 </th>
				<th> 작성자 </th>
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
					<td><a href="boardview.jsp?b_num=<%=board.getB_num()%>" class="text-dark"><%=board.getB_title() %></a></td>
							<!-- 게시물 상세페이지 이동 [ 클릭한 게시물 번호 요청 ] -->
					<td><%=board.getB_writer() %></td>
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






