<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		form{ width: 400px; margin: 0 auto;	}
		h3{ text-align: center; margin-top: 50px; }
		input { width:150px; height: 25px; }
		button { padding: 25px 25px; }
	</style>

</head>
<body>
	<!-- �޴��� ���� ���� -->
	<%@ include file="12.�޴���.jsp" %>
	
	<h3> �α��� </h3>
	
	<form>
		<table>
			<tr>
				<td> ���̵� </td>
				<td> <input type="text"> </td>
				<td rowspan="2"> <button> �α��� </button> </td>
			</tr>
			<tr>
				<td> ��й�ȣ </td>
				<td> <input type="password"> </td>
			</tr>
		</table>
	</form>
	
</body>
</html>









