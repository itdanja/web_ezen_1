<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="1.부트스트랩시작.jsp" %> <!-- 부트스트랩 css, js -->
	
	<div class="container">  <!--  박스권 -->
		<nav class="navbar navbar-expand-lg">  			<!-- navbar : 메뉴 박스권 --> 	<!-- navbar-expand-lg : 1200px 이상 일때 -->
		
		  	<a class="navbar-brand" href="#"> 로고 </a>		<!-- navbar-brand : 로고[ 진하게 ] -->
		  	
		  	<div class="collapse navbar-collapse">	 
		    <ul class="navbar-nav">			<!-- 메뉴박스권 메뉴  -->	
		      <li class="nav-item active"> <a href="#" class="nav-link"> 메뉴1 </a>  </li>	<!-- nav-item: 메뉴 아이템  -->	
		      <li class="nav-item"> <a href="#" class="nav-link"> 메뉴2 </a> </li>		<!-- nav-link : 하이퍼 링크 -->
		      <li class="nav-item"> <a href="#" class="nav-link"> 메뉴3 </a> </li>
		      
		      <li class="nav-item dropdown">		<!--  드랍다운  -->
		        <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">	<!--   dropdown-toggle : 아래화살표 -->
		          드랍다운
		        </a>
		        <div class="dropdown-menu">			<!-- 드랍다운 메뉴  -->
		          <a class="dropdown-item" href="#"> 드랍다운 메뉴1 </a>	<!-- 드랍다운 아이템 -->
		          <a class="dropdown-item" href="#"> 드랍다운 메뉴2 </a>
		          <a class="dropdown-item" href="#"> 드랍다운 메뉴3 </a>
		        </div>
		      </li>
		    </ul>
		 
		    <form class="form-inline">
		      	<input type="text" class="form-control" placeholder="검색어">
		      	<button class="btn btn-info" type="submit">검색</button>
		    </form>
		    
		  </div>
		</nav>
	</div> <!-- container 끝 -->
 
  
</body>
</html>