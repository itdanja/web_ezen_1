<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3> ��ũ��Ʈ ��</h3>
	
	<%! int one; String msg;%>
	<% int one=31;	String msg="���� ��ũ��Ʈ"; %>
	
	<br> one : <%=one %> <!-- ��ũ��Ʈ -->
	<br> msg : <%=msg %> <!-- ��ũ��Ʈ -->
	<br> ���� one : <%=this.one %>	<!-- ���� -->
	<br> ���� msg : <%=this.msg %> <!-- ���� -->
	<br> ���� ��� : <%=application.getRealPath("/") %>
	
	<%
		float f = 2.3f;
		int i = Math.round(f);
		Date date = new Date();	// java ���̺귯�� ȣ�� ����
	%>
	<br> �Ǽ� f�� �ݿø����� : <%=f %>
	<br> ������ ��¥�� �ð��� ? <%=date.toString() %>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>

