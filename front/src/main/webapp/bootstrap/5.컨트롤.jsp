<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file ="1.��Ʈ��Ʈ������.jsp" %>
	<h3>��Ʈ�� Ŭ���� </h3>
		<ul>
			<li> 1. form-control 
		</ul>
	<div class="container">
		<input type="text" class="form-control">
		<input type="password" class="form-control">
		<input type="datetime" class="form-control">
		<input type="datetime-local" class="form-control">
		<textarea rows="5" cols="5" class="form-control"></textarea>
		
		<div class="checkbox">
			<input type="checkbox">
		</div>
		
		<div class="radio">
			<input type="radio">
		</div>
		
		<div class="row">
			<div class="col-md-2">
				<input type="text" class="form-control">
			</div>
			<div class="col-md-2 offset-3">
				<input type="text" class="form-control">
			</div>
			<div class="col-md-2 offset-3">
				<input type="text" class="form-control">
			</div>
		</div>
	</div>
	
	<h3> ��ư </h3>
		<button type="button"> ��ư </button>
		<button type="button" class="btn"> ��ư </button>		<!--  -->
		<button type="button" class="btn btn-default"> ��ư </button>		<!--  -->
		<button type="button" class="btn btn-success"> ��ư </button>		<!--  -->
		<button type="button" class="btn btn-info"> ��ư </button>		<!--  -->
		<button type="button" class="btn btn-danger"> ��ư </button>		<!-- ������ -->
		
	<h3> �̹��� </h3>
		
		<div class="col-sm-6">
			<img src="������.jpg">
		</div>
		<div class="col-sm-6">
			<img src="������.jpg" class="rounded">
		</div>
		<div class="col-sm-6">
			<img src="������.jpg" class="rounded-circle img-fluid">
		</div>
		<div class="col-sm-6">
			<img src="������.jpg" class="img-thumbnail img-fluid">
		</div>
	
	
	
</body>
</html>








