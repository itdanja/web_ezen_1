<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		header{	/*��� �±� */
			width: 1150px;	/* ���α��� */
			margin: 0 auto;	/* �ڽ��� ������� [ ��Ʈ�� : text-align ] */
			height: 100px;	/* ���� : ���̾ƿ��� */
		}
		#main_img{
			width: 100%;	/* ���α��� : ����� */
			height: 250px;
		}
		#contents{
			width: 1150px;
			margin: 0 auto;s
		}
		#sub_menu{
			width: 240px;
			float: left;		/* �ڽ��� ���� ��ġ */
		}
		#main_contents{
			width: 900px;
			float: right;		/* �ڽ��� ������ ��ġ */
		}
		footer{
			width: 100%;
			height: 150px;
			clear: both; 		/* float ���� */
		}

	</style>

</head>
<body>

	<!-- 1. ���̾ƿ�( display : block => ��ĭ ���� ) -->
				<!--  ��� �±� [ div ��� �ص� ���� ] -->
	<%@include file="2.header.jsp" %>
				<!--  ���� �±� [ div ó�� ���� ������ ] -->
	<%@include file="3.mainimage.jsp" %>

	<%@include file="4.main.jsp" %>
	
	<%@include file="5.footer.jsp" %>
	
</body>
</html>





