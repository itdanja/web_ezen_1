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
	<%@include file="1.부트스트랩시작.jsp" %>
	<div class="container"> <!-- 1300px 박스권 -->
		<header>
			<h2> 그리드 레이아웃 </h2>
		</header>
		<div class="row">
			<div class="col-md-2">	<!-- 본문의 사이드바 -->
				<ul>		<!-- nav : inline -->
					<li> 메뉴1 </li>
					<li> 메뉴2 </li>
					<li> 메뉴3 </li>
					<li> 메뉴4 </li>
				</ul>
			</div>
			<div class="col-md-8"> <!-- 본문의 내용 -->
				<div class="row">	<!-- inline -->
					<div class="col-md-5 offset-2">	<!-- 본문내 12그리드 5  [ 왼쪽 2칸 띄어쓰기 ] -->
						<p>개는 중형 동물이자 가장 널리 분포하며 개체 수가 가장 많은 지상 동물 중 하나이며, 학명은 Canis lupus familiaris이다. 개는 인류가
					</div>
					<div class="col-md-5">	<!-- 본문내 12그리드 5 -->
						<p>개는 중형 동물이자 가장 널리 분포하며 개체 수가 가장 많은 지상 동물 중 하나이며, 학명은 Canis lupus familiaris이다. 개는 인류가
					</div>
				</div>
			</div>
			<div class="col-md-2">	<!-- 본문의 사이드바 -->
				<ul>		<!-- nav : inline -->
					<li> 메뉴1 </li>
					<li> 메뉴2 </li>
					<li> 메뉴3 </li>
					<li> 메뉴4 </li>
				</ul>
			</div>
			
		</div>
		<footer>
			여기는 푸터
		</footer>
	</div>
	
</body>
</html>






