<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file ="header.jsp" %>
	
	<h3> 게시물 상세페이지 </h3>
	<%
		int bnum = Integer.parseInt( request.getParameter("bnum"));
	%>
	<a href="boardlist.jsp"><button>목록보기</button></a>
	<table>
		<tr>
			<td> 번호 : </td>	 <td> <%=bnum %> </td>
		</tr>
		
		<tr>
			<td> 제목 : </td>	 <td> <%=boards.get(bnum).getTitle() %> </td>
		</tr>
		
		<tr>
			<td> 내용 : </td>	 <td> <%=boards.get(bnum).getContents() %> </td>
		</tr>
	</table>
	
	

</body>
</html>