<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		form{ width: 700px; margin: 0 auto; }
		table{ width: 700px; border-top: solid 3px black; }
		td{ border-bottom: solid 1px #cccccc; padding: 20px;}
		input{ width: 500px; height: 30px;}
		textarea { width: 500px; height: 100px;}
		.col1{ width: 100px; }
		#buttons{ width: 700px; text-align: right; }
		#buttons button { 
			padding: 5px 20px; 
			margin : 20px 10px;
		}
		h3{ text-align: center; margin-top: 50px; }
	</style>
</head>
<body>
	<%@ include file="12.메뉴바.jsp" %>
	<h3> 게시판 글쓰기 </h3>
	<form>
		<table>
			<tr>
				<td class="col1"> 이름 </td>
				<td> 홍길동 </td>
			</tr>
			<tr>
				<td class="col1"> 제목 </td>
				<td> <input type="text"> </td>
			</tr>
			<tr>
				<td class="col1"> 글 내용 </td>
				<td> <textarea></textarea>
			</tr>
			<tr>
				<td class="col1"> 파일 </td>
				<td> <input type="file"> </td>
			</tr>
		</table>
		<div id="buttons">
			<button>저장하기</button><button>목록보기</button>
		</div>
	</form>

</body>
</html>