<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		*{ text-align: center; }
		header{ height: 100px; background-color: skyblue; padding: 10px; margin: 10px; border-radius: 10px;  }
		footer{ border-top: dotted 2px black; }
		ul{ padding: 10px; background-color: green; border-radius: 10px; }
	</style>
</head>
<body>
	<%@include file="1.��Ʈ��Ʈ������.jsp" %>
	<div class="container"> <!-- 1300px �ڽ��� -->
		<header>
			<h2> �׸��� ���̾ƿ� </h2>
		</header>
		<div class="row">
			<div class="col-md-2">	<!-- ������ ���̵�� -->
				<ul>		<!-- nav : inline -->
					<li> �޴�1 </li>
					<li> �޴�2 </li>
					<li> �޴�3 </li>
					<li> �޴�4 </li>
				</ul>
			</div>
			<div class="col-md-8"> <!-- ������ ���� -->
				<div class="row">	<!-- inline -->
					<div class="col-md-5 offset-2">	<!-- ������ 12�׸��� 5  [ ���� 2ĭ ���� ] -->
						<p>���� ���� �������� ���� �θ� �����ϸ� ��ü ���� ���� ���� ���� ���� �� �ϳ��̸�, �и��� Canis lupus familiaris�̴�. ���� �η���
					</div>
					<div class="col-md-5">	<!-- ������ 12�׸��� 5 -->
						<p>���� ���� �������� ���� �θ� �����ϸ� ��ü ���� ���� ���� ���� ���� �� �ϳ��̸�, �и��� Canis lupus familiaris�̴�. ���� �η���
					</div>
				</div>
			</div>
			<div class="col-md-2">	<!-- ������ ���̵�� -->
				<ul>		<!-- nav : inline -->
					<li> �޴�1 </li>
					<li> �޴�2 </li>
					<li> �޴�3 </li>
					<li> �޴�4 </li>
				</ul>
			</div>
			
		</div>
		<footer>
			����� Ǫ��
		</footer>
	</div>
	
</body>
</html>






