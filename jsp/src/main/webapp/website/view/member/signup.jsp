<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
	
	<div class="container"> <!-- 박스권  -->
		<div class="row"> <!-- 가로 박스 -->
		
			<div class="col-md-6">	<!-- 6:6 -->
				<img src="">
			</div>
			<div class="col-md-6"> 	
				<form>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>아이디</label> </div>
						<div class="col-md-8"> <input type="text" name="id" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>비밀번호</label> </div>
						<div class="col-md-8"> <input type="password" name="password" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>비밀번호확인</label> </div>
						<div class="col-md-8"> <input type="password" name="passwordconfirm" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>이름</label> </div>
						<div class="col-md-8"> <input type="text" name="name" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>생년월일</label> </div>
						<div class="col-md-8"> <input type="date" name="birth" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>성별</label> </div>
						<div class="col-md-8 text-center"> 
						
							<input type="radio" name="sex" value="man"> 남
							<input type="radio" name="sex" value="woman"> 여
							
						</div>
					</div>
					
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>연락처</label> </div>
						<div class="col-md-8">
							<input type="text" name="phone" class="form-control" placeholder="000-0000-0000">
						</div>
					</div>
					
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>주소</label> </div>
						<div class="col-md-8"> 
							<div class="row">
								<div class="col-md-6"> <input type="text" id="sample4_postcode" placeholder="우편번호" class="form-control"> </div>
								<div class="col-md-6"> <input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br> </div>
							</div>
							<div class="row">
								<div class="col-md-6"> <input type="text" id="sample4_roadAddress" placeholder="도로명주소" class="form-control"> </div>
								<div class="col-md-6"> <input type="text" id="sample4_jibunAddress" placeholder="지번주소" class="form-control"> </div>
							</div>
							<input type="text" id="sample4_detailAddress" placeholder="상세주소" class="form-control">
						</div>
					</div>
					<div>
						<input type="submit" value="가입 하기" class="form-control p-3 m-3">
					</div>
				</form>
			</div>
		</div>
	</div>
	

</body>
</html>







