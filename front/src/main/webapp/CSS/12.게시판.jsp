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
	<%@ include file="12.�޴���.jsp" %>
	<h3> �Խ��� �۾��� </h3>
	<form>
		<table>
			<tr>
				<td class="col1"> �̸� </td>
				<td> ȫ�浿 </td>
			</tr>
			<tr>
				<td class="col1"> ���� </td>
				<td> <input type="text"> </td>
			</tr>
			<tr>
				<td class="col1"> �� ���� </td>
				<td> <textarea></textarea>
			</tr>
			<tr>
				<td class="col1"> ���� </td>
				<td> <input type="file"> </td>
			</tr>
		</table>
		<div id="buttons">
			<button>�����ϱ�</button><button>��Ϻ���</button>
		</div>
	</form>

</body>
</html>