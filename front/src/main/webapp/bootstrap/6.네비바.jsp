<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="1.��Ʈ��Ʈ������.jsp" %> <!-- ��Ʈ��Ʈ�� css, js -->
	
	<div class="container">  <!--  �ڽ��� -->
		<nav class="navbar navbar-expand-md navbar-light fixed-top" style="background-color: yellow;">  			<!-- navbar : �޴� �ڽ��� --> 	<!-- navbar-expand-lg : 1200px �̻� �϶� -->
												<!-- fixed-top : �� �޴� ����		fixed-bottom : �Ʒ� �޴� ���� -->
									
		  	<a class="navbar-brand" href="#"> �ΰ� </a>		<!-- navbar-brand : �ΰ�[ ���ϰ� ] -->
		  	
		  	<!-- �޴� ��������� ��ư -->
		    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents" 
		    	aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
    		<span class="navbar-toggler-icon"></span>
  			</button>
		  
		  	<div class="collapse navbar-collapse" id="navbarcontents">	 
		    <ul class="navbar-nav mr-auto">			<!-- �޴��ڽ��� �޴�  -->	
		      <li class="nav-item active"> <a href="#" class="nav-link"> �޴�1 </a>  </li>	<!-- nav-item: �޴� ������  -->	
		      <li class="nav-item"> <a href="#" class="nav-link"> �޴�2 </a> </li>		<!-- nav-link : ������ ��ũ -->
		      <li class="nav-item"> <a href="#" class="nav-link"> �޴�3 </a> </li>
		      
		      <li class="nav-item dropdown">		<!--  ����ٿ�  -->
		        <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" 
		        	aria-haspopup="true" aria-expanded="false">	<!--   dropdown-toggle : �Ʒ�ȭ��ǥ -->
		          ����ٿ�
		        </a>
		        <div class="dropdown-menu">			<!-- ����ٿ� �޴�  -->
		          <a class="dropdown-item" href="#"> ����ٿ� �޴�1 </a>	<!-- ����ٿ� ������ -->
		          <a class="dropdown-item" href="#"> ����ٿ� �޴�2 </a>
		          <a class="dropdown-item" href="#"> ����ٿ� �޴�3 </a>
		        </div>
		      </li>
		    </ul>
		 
		    <form class="form-inline">
		      	<input type="text" class="form-control" placeholder="�˻���">
		      	<button class="btn btn-info" type="submit">�˻�</button>
		    </form>
		    
		  </div>
		</nav>
	</div> <!-- container �� -->
 
  
</body>
</html>