<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
	aside .title1{ 
		background-color:#0ca9a3; 
		color: white; padding: 15px; font-size: 18px;
	}
	aside .comment{
		padding: 20px 10px;
		line-height: 150%;
	}
	aside .search input {
		width: 150px;	height: 32px;
		border: solid 1px black;
	}
	aside .search button {
		margin-left: 5px; /*입력상자와 간격 */
		padding: 5px 10px;
	}	 
	aside .title2{
		margin-top: 20px;	padding: 15px;
		font-size: 15px;
		border-bottom: solid 1px #cccccc;
		border-top: solid 2px black;
	}
	aside .list{ margin: 20px 0;}
	aside .list li { margin: 10px; }
	
	</style>

</head>
<body>

	<aside>
		<h3 class="title1"> The 베이킹</h3>
		<p class="comment"> 안녕하세요. 쿠키와 빵 만들기 정보를 공유하고 소통하는 공간입니다.</p>
		<div class="search">
			<input type="text"><button>검색</button>
		</div>
		<h3 class="title2"> 베이킹/요리 </h3>
		<ul class="list">
			<li> 쿠키 만들기 </li>
			<li> 빵 만들기 </li>
			<li> 마카롱 만들기 </li>
		</ul>
		
		<h3 class="title2"> 최근 댓글 </h3>
		<ul class="list">
			<li> 쿠키 만들기 </li>
			<li> 빵 만들기 </li>
			<li> 마카롱 만들기 </li>
		</ul>
	</aside>

</body>
</html>



