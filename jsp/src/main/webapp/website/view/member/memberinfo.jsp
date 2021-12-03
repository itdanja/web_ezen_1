<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
					
					<%
						// 로그인된 아이디[세션]의 정보 호출
						Member member = MemberDao.getmemberDao().getmember(loginid);
					%>
					<div class="tab-pane fade" id="pills-memberinfo">
						<div class="container">
							<table class="table text-center">	<!-- class="table" : 부트스트랩 테이블 --> 
								<thead>
									<tr>
										<th colspan="3" > 회원 개인 정보 </th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td> 아이디 </td> <td colspan="2"> <%=member.getM_id() %> </td>	
									</tr>
									<tr>
										<td> 패스워드 </td> <td> ···· </td>  	<td> <button class="form-control">수정</button> </td>
									</tr>
									<tr>
										<td> 포인트 </td> <td colspan="2"> <%=member.getM_point() %> </td>
									</tr>
									<tr>
										<td> 회원명 </td> 
										<td id="tdname"> <%=member.getM_name() %> </td>
										<td> <button onclick="namechange();" class="form-control">수정</button> </td>
									</tr>
									<tr>
										<td> 성별 </td> <td> <%=member.getM_sex() %> </td>  	<td> <button class="form-control">수정</button> </td>
									</tr>
									<tr>
										<td> 생년월일 </td> <td> <%=member.getM_brith() %> </td>  	<td> <button class="form-control">수정</button> </td>
									</tr>
									<tr>
										<td> 연락처 </td> <td> <%=member.getM_phone() %> </td>  	<td> <button class="form-control">수정</button> </td>
									</tr>
									<tr>
										<td> 주소 </td> <td> <%=member.getM_address() %> </td>  	<td> <button class="form-control">수정</button> </td>
									</tr>
									<tr style="display: none;" id="traddress">	<!-- css 숨기기 -->
										<td colspan="3">
										<div class="row">	<!-- 3:8 -->
											<div class="col-md-3 m-2"> <label>주소</label> </div>
											<div class="col-md-8"> 
												<div class="row">
													<div class="col-md-6"> <input type="text" name="address1" id="sample4_postcode" placeholder="우편번호" class="form-control"> </div>
													<div class="col-md-6"> <input type="button"  onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br> </div>
												</div>
												<div class="row">
													<div class="col-md-6"> <input type="text" name="address2" id="sample4_roadAddress" placeholder="도로명주소" class="form-control"> </div>
													<div class="col-md-6"> <input type="text" name="address3" id="sample4_jibunAddress" placeholder="지번주소" class="form-control"> </div>
												</div>
												<input type="text" id="sample4_detailAddress" name="address4" placeholder="상세주소" class="form-control">
											</div>
										</div>
										<td>
									</tr>
									<tr>
										<td> 가입일 </td> <td colspan="2">  <%=member.getM_sdate() %> </td> 
									</tr>
								</tbody>
							</table>
							
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



