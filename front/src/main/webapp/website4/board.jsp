<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%@include file="header.jsp"%>
	
	<!-- �Խ��� start -->
	<br> <br> <br> <br> <br>
	<div class="container my-5">
		
		<h3> QnA </h3>
		<p> ���� �Խ��� </p>
		<div class="col-md-6 offset-6 input-group my-3">
			<select class="custom-select"> <!-- �˻� Ű����  -->
				<option>Ű����</option>
				<option>��ȣ</option>
				<option>����</option>
				<option>�ۼ���</option>
			</select>
			<input type="text" class="form-control"> 	<!-- �˻�â -->
			<button class="btn btn btn-outline-info">�˻�</button>	<!-- �˻���ư -->
		</div>
		<div>	<!-- ���̺� -->
			<table class="table table-striped">	
				<thead>
					<tr>
						<th>��ȣ</th><th>����</th> <th> �ۼ��� </th> <th>�亯����</th><th>�ۼ���</th>
					</tr>
				</thead>
				<tbody>
					<tr><td> 1 </td> <td> ȯ���� �ּ���~~~ ȯ���� �ּ���~~~  ȯ���� �ּ���~~~ </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26 </td></tr>
					<tr><td> 2 </td> <td> ȯ���� �ּ���~~~ </td> <td> ���缮 </td> <td> �亯�Ϸ� </td> <td> 2021-11-26 </td></tr>
					<tr><td> 3 </td> <td> ȯ���� �ּ���~~~ </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26 </td></tr>
					<tr><td> 4 </td> <td> ȯ���� �ּ���~~~ </td> <td> ���缮 </td> <td> �亯�Ϸ� </td> <td> 2021-11-26 </td></tr>
					<tr><td> 5 </td> <td> ȯ���� �ּ���~~~ </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26 </td></tr>
				</tbody>
			</table>	
		</div>
		
		<div class="row">
			<div class="col-md-4 offset-4 my-3">
				<ul class="pagination"> <!-- �Խ��� ����¡ ��ȣ -->
					<li class="page-item"> <a class="page-link">����</a> </li>
					<li class="page-item"> <a class="page-link">1</a> </li>
					<li class="page-item"> <a class="page-link">2</a>  </li>
					<li class="page-item"> <a class="page-link">3</a>  </li>
					<li class="page-item"> <a class="page-link">4</a>  </li>
					<li class="page-item"> <a class="page-link">5</a>  </li>
					<li class="page-item"> <a class="page-link">����</a> </li>
				</ul>
			</div>
			
			<div class="col-md-1 offset-3 my-3">
				<button class="btn btn btn-outline-info"> �����ϱ� </button>
			</div>
		</div>
	</div>
	
	
	<!-- �Խ��� end -->
	<br> <br> <br> <br> <br>
	<%@include file="footer.jsp"%>


</body>
</html>