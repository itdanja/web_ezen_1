<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		*{ border:  solid 1px red;}
		header{ height: 150px;  }
		.box{ width: 1100px; margin: 0 auto; }
		aside{ width: 220px; float:left; }
		#main{ width: 840px; float:right; }
		footer{ clear: both; height: 150px;}
	</style>

</head>
<body>

	<%@include file="2.header.jsp" %>
	<%@include file="3.mainimage.jsp" %>
	
	<div class="box">	
		<%@include file="4.sidebar.jsp" %>
		<%@include file="5.main.jsp" %>
	</div>
	
	<footer>
		<div class="box">
			푸터
		</div>	
	</footer>
</body>
</html>



