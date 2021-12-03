<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file = "../header.jsp" %>
	
	<div class="container">
	
		<br><br>
		
		<div style="margin: 10px">
			<h3 style="border-bottom: solid 1px #eeeee;"> 회원 정보 </h3>
			<br>
			<p style="color: orange;"> · 공지사항을 참고해주세요 · </p>
		</div>
			<br><br>
		<div class="row">
			<div class="col-md-3">	<!-- 사이드바 -->
				<div class="nav flex-column nav-pills">	<!-- flex-column : 세로 메뉴 	// nav-pills : 액티브[클릭] 색상  -->
					<a class="nav-link active" data-toggle="pill" href="#pills-order"> 주문 목록 </a>	
					<a class="nav-link" data-toggle="pill" href="#pills-memberinfo"> 회원 정보 </a>	
					<a class="nav-link" data-toggle="pill" href="#pills-memberwrite"> 내가 쓴글 </a>	
					<a class="nav-link" data-toggle="pill" href="#pills-memberupdate"> 회원 수정 </a>	
					<a class="nav-link" data-toggle="pill" href="#pills-memberdelete"> 회정 탈퇴 </a>	
				</div>
			</div>
			
			<div class="col-md-9">	<!-- 내용 -->
				<div class="tab-content" id="pills-tabcontent">
				
					<div class="tab-pane fade show active" id="pills-order">	<!-- fade : 숨김  show : 열기   -->
						<h3> 주문 목록 </h3>
						<div class="container">
							하하하하하하ㅏ하하하하하
						</div>
					</div>
					
					<div class="tab-pane fade" id="pills-memberinfo">
						<h3> 회원 정보 </h3>
						<div class="container">
							하하하하하하ㅏ하하하하하
						</div>
					</div>
					
					<div class="tab-pane fade" id="pills-memberwrite">
						<h3> 내가 쓴글 </h3>
						<div class="container">
							하하하하하하ㅏ하하하하하
						</div>
					</div>
					
					<div class="tab-pane fade" id="pills-memberupdate">
						<h3> 회원 수정 </h3>
						<div class="container">
							하하하하하하ㅏ하하하하하
						</div>
					</div>
			
			
					<div class="tab-pane fade" id="pills-memberdelete">
						<div class="container">
							<div class="col-md-6 offset-3">
								<h3 id="deleteresult" > 회원탈퇴 하시겠습니까?</h3>
								<form id="deleteform">
									<br>
									<input type="password" id="password"  name="password" class="form-control" placeholder="패스워드"> 
									<br>
									<input type="button" id="delete" value="탈퇴" class="form-control">
								</form>
							</div>
						</div>
					</div>
			
				</div>
				
			</div>
		</div>
	</div>
	
	<%@include file = "../footer.jsp" %>
		
</body>
</html>



