<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		#menuul{ 
			text-align: center; 	/* �ؽ�Ʈ ��� ���� */
			background-color: skyblue;	/* ���� */
			color: white;				/* �۲� �� */
			padding: 15px;				/* ���� ���� */
		}
		.menuli{
			display: inline;			/* inline(������)  block(��������) */
			margin-left: 20px;			/* ���� �ٱ����� */
		}
		a{				
			color: white;				/* ��ũ ���� */ 			
			text-decoration: none;		/* ��ũ( �⺻�� : ���� ) �������� */
		}
		a:hover{ color: orange; }		/* ���콺�� �÷����� */
	</style>
</head>
<body>
	<ul id="menuul">	<!-- ul(unorder list) : �������� ���  -->
		<li class="menuli"> <a href="#"> �Ұ� </a> </li>	
		<li class="menuli"> <a href="#"> �� ���� </a></li>
		<li class="menuli"> <a href="12.�α���.jsp"> �α��� </a> </li>
		<li class="menuli"> <a href="#"> ȸ������ </a> </li>
		<li class="menuli"> <a href="#"> ã�� ���ô� �� </a> </li>
	</ul>

</body>
</html>





