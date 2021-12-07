<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
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
	
		<%
		
			int b_num = Integer.parseInt( request.getParameter("b_num")) ; // 전 페이지에서 클릭한 게시물번호	

				String boardviews =  loginid +":"+b_num;
				if( session.getAttribute( boardviews) == null ){
					// 조회수 증가
					BoardDao.getboarddao().boardcount(b_num);
					// 조회수 증가 방지 [ 세션 생성 : 세션아이디 , 세션값 ]
					String boardview = loginid +":"+b_num;
					session.setAttribute( boardview ,  true   );
					session.setMaxInactiveInterval(60*60*24);	// 세션 유효시간 : 초당 [ 하루 ]
				}
			// 해당 게시물번호의 게시물 가져오기
			Board board =BoardDao.getboarddao().getboard(b_num);
		%>
		
		<!-- 게시물 상세 페이지 -->
		<div class="container">
			<div class="row">
				<div class="m-2"> <a href="boardlist.jsp"><button class="form-control">목록보기</button></a> </div>
				<div class="m-2"> <a href="#"><button class="form-control">수정하기</button></a> </div>
				<div class="m-2"> <a href="#"><button class="form-control">삭제하기</button></a> </div>
			</div>
			<table class="table">
				<tr>
					<td style="width: 20%"> 작성자 <%=board.getB_writer()  %> </td> 
					<td> 작성일 <%=board.getB_date() %> </td>
					<td> 조회수 <%=board.getB_view() %> </td>
				</tr>
				<tr>
					<td>제목</td> <td colspan="2"> <%=board.getB_title() %> </td>
				</tr>
				<tr>
					<td style="height:300px;">내용</td> <td colspan="2">  <%=board.getB_contents() %>  </td>
				</tr>
				<tr>
					<td> 첨부파일 다운로드 <br>
					<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file() %></a> 
					</td> 
					
					<td colspan="2"> 미리보기<br> <img src="../../upload/<%=board.getB_file()%>" width="100%"></td>
					
				</tr>
			</table>
		</div>

</body>
</html>



