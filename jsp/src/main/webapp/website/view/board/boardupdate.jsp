<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
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
		int b_num = Integer.parseInt(request.getParameter("b_num") ); 
		Board board =  BoardDao.getboarddao().getboard(b_num); // 수정할 게시물
		board.setB_contents( board.getB_contents().replaceAll("<br>", "\n") ); // <br> -> \n
	%>
	<%@ include file = "../header.jsp" %>
	<div class="container">
		<form action="../../controller/boardupdatecontroller.jsp" method="post" enctype="multipart/form-data" >
			<!-- 매개변수 값을 숨겨서 보내기 -->
			<input type="hidden" name="b_num" value="<%=b_num%>">	<!-- 수정할 게시물번호 -->
			<input type="hidden" name="oldfile" value="<%=board.getB_file()%>"> <!-- 첨부파일 변경이 없을경우 기존파일 -->
			제목 : <input type="text" name="title" value="<%=board.getB_title()%>"> <br>
			내용 : <textarea rows="10" cols="20" name="contents"> <%=board.getB_contents() %> </textarea> <br>
			첨부파일 : <input type="file" name="file"> *<%=board.getB_file() %> <br>
			<input type="submit" value="등 록">	
		</form>
	</div>
		
	
	

</body>
</html>







