<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


	
	<style type="text/css">
	
		.carousel-item{
			width : 1110px;
			height: 580px;
		}
		
	</style>

</head>
<body>

	<%@include file="1.��Ʈ��Ʈ������.jsp" %> <!-- ��Ʈ��Ʈ�� css, js -->
	
	<h3> �̹��� �����̵� [ ĳ���� ] </h3>
	<div class="container">	
	
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
			<!-- carousel slide : �̹��� �����̵�   	data-interval : �����̵� ��ȯ ��[1000/1]   -->
			
			<ol class="carousel-indicators">	<!-- carousel-indicators : ���� �����̵� ��ġ  -->
				<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
				<li data-target="#carouselcontents" data-slide-to="1" ></li>
				<li data-target="#carouselcontents" data-slide-to="2" ></li>
			</ol>
			
			<div class="carousel-item active">	<!-- �����̵峻 ������ -->
				<img src="����Ű.png" alt="ù��° �����̵�">
				<div class="carousel-caption"> <!-- �̹��� ���̺� -->
					<h3> ������ </h3>
					<p> �ȳ��ϼ��� ������ �̹��� �Դϴ� </p>
				</div>
			</div>
			<div class="carousel-item">	<img src="����Ű.png" alt="�ι�° �����̵�">	</div>
			<div class="carousel-item">	<img src="����Ű.png" alt="����° �����̵�">	</div> 
			
			<!-- �̵� ��ư -->
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">	<!-- ���� �̹��� �̵� ��ư -->
				<span class="carousel-control-prev-icon"></span>	<!-- ������ -->
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next">	<!-- ���� �̹��� �̵� ��ư -->
				<span class="carousel-control-next-icon"></span>	<!-- ������ -->
			</a>
			
		</div>
		
	</div>

</body>
</html>



