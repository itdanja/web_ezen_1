<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
	<style type="text/css">
	
		#productul{
			width: 250px;
			border:  solid 1px #dddddd;
			list-style-type: none;	/*�۸Ӹ�����*/
			margin: 10px;
			padding: 5px;
		}
		.row1{ text-align: center;}	
		.row1 img{ width: 200px; }
		#productul li{padding: 5px;}
		.row2{ font-weight: bold;}
		.row3{font-size: 10px;font-weight: bold;}
		.row4{font-size: 10px;}
		.row5{font-size: 10px;}
		.row5 span{color: orange; font-weight: bold;}
	</style>
	


</head>
<body>

	<%@ include file="12.�޴���.jsp" %>
	<h3> ��ǰ �Ұ� </h3>

	<ul id="productul">
		<li class="row1"> <img src="���ξ���.jpg"></li>
		<li class="row2"> �����̾� ���ξ��� �ٱ��ϼ�Ʈ ... </li>
		<li class="row3"> 25,000�� </li>
		<li class="row4"> �Ǹ��ڰ� ����Ű�� ���ξ����Դϴ�. ������, �����, ������, 
				���� �� Ư���� ���� ��ŭ�� ���ξ��ð� �Բ�...</li>
		<li class="row5"> ���� <span>130</span> �� ���� <span>4.9</span> </li>	<!--  �� : alt+ 1 8 3 -->
	</ul>
	
</body>
</html>





