<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 만약에 로그인이 되어있는경우 -->
	
	
	<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
	<%
		// 로그인[세션]이 되어 있는경우
		if( loginid != null ){
			out.print("<script>alert('로그인이 되어있습니다.');</script>");
			out.println("<script>location.href='../main.jsp';</script>");
		}
	%>
	
	<div class="container"> <!-- 박스권  -->
		
		<div class="text-center">
			<h3 style="border-bottom: solid 1px #eeeee;"> 로그인  </h3>
			<br>
			<p style="color: orange;"> · 벤츠에 가입하시면 다양한 이벤트를 제공 받을수 있습니다. · </p>
		</div>
		<div class="row m-3"> <!-- 가로 박스 -->
			<div class="col-md-6">	<!-- 6:6 -->
				<img src="../../img/signuplogo.png" width="100%">
			</div>
			<div class="col-md-6 align-self-center">
							<!-- 가운데 정렬 -->
				<form action="../../controller/logincontroller.jsp" method="post">
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>아이디</label> </div>
						<div class="col-md-8"> <input type="text" name="id" class="form-control" maxlength="15"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>비밀번호</label> </div>
						<div class="col-md-8"> <input type="password" name="password" class="form-control" maxlength="15"> </div>
					</div>
					
					<%
						
						String result = request.getParameter("result");
						if( result != null ){
							%>
								<div>
									<span>회원정보가 올바르지 않습니다.</span>
								</div>
							<%
						}
					
					%>
					
					<div>
						<input type="submit" value="로그인" class="form-control p-3 m-3">
					</div>
					<div class="text-right m-2">
						<!-- text-center : 가운데정렬 text-right: 오른쪽정렬 text-left: 왼쪽 -->
						<a href="signup.jsp" class="btn text-dark"> ·회원가입 </a> <a href="#" class="btn text-dark"> ·아이디 찾기 </a> <a href="#" class="btn text-dark"> ·비밀번호 찾기 </a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

</body>
</html>







