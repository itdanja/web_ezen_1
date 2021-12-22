<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>
	
	<h3 class="text-center"> 실시간 채팅</h3>
	
	<div class="container">
	
		<div class="row">
			
			<div class="col-md-6">
				<div id="msgbox">	<!-- 채팅창 -->
					<div class="d-flex justify-content-end mx-2 my-2">  <!-- 보내는 메시지 -->
						<span class="msgtime d-flex align-items-end">오전 9:59</span>
						<span class="from mx-1">안녕하세요.</span>
					</div>
				
					<div class="d-flex justify-content-start mx-2 my-2">
						<span class="to mx-1">하하하하하하.</span>		 <!-- 받는 메시지 -->
						<span class="msgtime d-flex align-items-end">오전 9:59</span>
					</div>
				</div>
				<div class="row no-gutters">	<!-- 채팅입력 창  , 전송버튼 -->
					<div class="col-md-10"><!-- 채팅입력 창 -->
						<input id="msginput" class="form-control" type="text" placeholder="내용 입력">
					</div>
					<div class="col-md-2">	<!-- 전송버튼 -->
						<button class="form-control">전송</button>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				보내는 사람 : <input id="loginid" class="form-control" type="text" value="<%=loginid %>" >
				받는 사람 :  <input class="form-control" type="text" value="all">
				접속 회원 목록
				<div id="mlist">
				
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	
		// 1. 입력창에 입력된 데이터를 가져온다
		var msginput = document.getElementById("msginput").value;
		// 2. 현재 회원 아이디 가져오기 
		var loginid = document.getElementById("loginid").value;	// value 속성이 있는 태그만 가능 
		// 3. 채팅창 가져오기 
		var msgbox =  document.getElementById("msbox");
		// 4. 웹소켓 
			// var webSocket = new WebSocket("ws://ip:http port번호/프로젝트명/경로");
		var webSocket = new WebSocket("ws://localhost:8080/jsp/chatting"); 
			// 접속객체 									// @ServerEndpoint 이동
			
			// 5. 웹소켓 이벤트 
			webSocket.onopen = function( event ) { onOpen(event) }; // 웹소켓 실행시 메소드 
			webSocket.onclose = function( event ) { onClose(event) }; // 웹소켓 종료시 메소드 
			webSocket.onmessage = function( event ) { onMessage(event) }; // 웹소켓 메시지전송 메소드 
			webSocket.onerror = function( event ) { onError(event) }; // 웹소켓 오류 메소드 
			
		// 6. 이벤트 메소드 정의
		function onOpen(event) {alert("접속 되었습니다.");}
		function onClose(event) {alert("퇴장 했습니다.");}
		function onMessage(event) {alert("메시지가 왔습니다.");}
		function onError(event) {alert("오류 발생[ 관리자에게 문의].");}
		
		// 7. 보내는 메소드 
		function send( ) {
			webSocket.send("하하하하하하");	 // 서버로 부터 메시지 전송 
		}
		
	</script>
	
	
	
</body>
</html>



























