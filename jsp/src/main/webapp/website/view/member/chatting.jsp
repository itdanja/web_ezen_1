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
	
		<div class="row my-3"> 
			<button class="form-control col-md-3 offset-3" onclick="start('<%=loginid%>')"> 채팅방 들어가기 </button>
			<button class="form-control col-md-3" onclick="exit();">채팅방 나가기</button>
		</div>
		<div class="row" style="display:none;" id="chattingdiv">
			
			<div class="col-md-6 offset-2">
				<div id="msgbox">	<!-- 채팅창 -->
					<!-- 채팅 메시지가 추가 되는 위치 -->
				</div>
				<div class="row no-gutters">	<!-- 채팅입력 창  , 전송버튼 -->
					<div class="col-md-2">
						<input id="toid" class="form-control" type="text" placeholder="공개">
					</div>
					<div class="col-md-8"><!-- 채팅입력 창 -->
						<input id="msginput" class="form-control" type="text" placeholder="내용 입력" onkeyup="entersend();">
					</div>
					<div class="col-md-2">	<!-- 전송버튼 -->
						<button class="form-control" onclick="btnsend()">전송</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		/* 전역변수들 : 모든 function 에서 사용되는 변수들 */
		// 로그인된아이디 // 메시지창 // 웹소켓 
		var loginid = null;  var msgbox =  null; var webSocket = null;
		
		function start( id ) {
			// 로그인이 안되어 있을때 
			if(  id == "null"  ){ 
				alert("로그인해주세요");
			}
			else{ // 로그인시 
				// 채팅창 보이기 
				document.getElementById("chattingdiv").style="display:block";	// css 변경
				loginid = id; // 로그인된 아이디 넣어주기 
				// 3. 채팅창 가져오기 
				msgbox =  document.getElementById("msgbox");
				// 4. 웹소켓 [ 웹소켓 메모리 할당[서버소켓과 연결] ]
				// var webSocket = new WebSocket("ws://ip:http port번호/프로젝트명/경로");
				webSocket = new WebSocket("ws://localhost:8080/jsp/chatting");
				// 접속객체 		
				// 5. 웹소켓 이벤트 [ 인수에 현재 세션 정보 WsSession@9d4f4b0 ]
				webSocket.onopen = function( event ) { onOpen(event) }; // 웹소켓 실행시 메소드 
				webSocket.onclose = function( event ) { onClose(event) }; // 웹소켓 종료시 메소드 
				webSocket.onmessage = function( event ) { onMessage(event) }; // 웹소켓 메시지전송 메소드 
				webSocket.onerror = function( event ) { onError(event) }; // 웹소켓 오류 메소드
			}
		}
		function exit() {
			document.getElementById("chattingdiv").style="display:none";	// css 변경
			webSocket.close();	
		}
	
	
		// 6. 이벤트 메소드 정의
		function onOpen(event) { alert("접속 되었습니다."); }
		function onClose(event) { alert("퇴장 했습니다.");}
		function onError(event) { alert( "에러사유 :"+event.data +"[관리자에게문의]" );}
		
		// 8. 받는 메소드 
		function onMessage(event) { 
			var from = event.data.split(",")[0];	// , 기준으로 문자열 분리해서 첫번째 문자열
			var to = event.data.split(",")[1];	// , 기준으로 문자열 분리해서 두번째 문자열
			var time = event.data.split(",")[2];	// , 기준으로 문자열 분리해서 세번째 문자열
			var msg = event.data.split(",")[3];		// , 기준으로 문자열 분리해서 네번째 문자열
			
			// 현재 로그인된 아이디와 to 와 동일할경우 [ 메시지 받음 ]
			if( to == loginid ){ // 특정 아이디만 받기
				msgbox.innerHTML += "<div class='profile mx-2 my-2'>"+from+"</div>"
				msgbox.innerHTML += "<div class='d-flex justify-content-start mx-2 my-2'><span class='to mx-1'>"+msg+"</span><span class='msgtime d-flex align-items-end'>"+time+"</span></div>"
				msgbox.scrollTop = msgbox.scrollHeight; // 현 스크롤 위치 =  스크롤 전체높이 [ 바닥 ]
			}
			else if( to == "all" ){ // 모든 메시지[ 모든 사람이 받는 메시지 ]
				msgbox.innerHTML += "<div class='profile mx-2 my-2'>"+from+"</div>"
				msgbox.innerHTML += "<div class='d-flex justify-content-start mx-2 my-2'><span class='to mx-1'>"+msg+"</span><span class='msgtime d-flex align-items-end'>"+time+"</span></div>"
				msgbox.scrollTop = msgbox.scrollHeight; // 현 스크롤 위치 =  스크롤 전체높이 [ 바닥 ]	
			}
		
		}
		
		// 7. 보내는 메소드 
		function btnsend() {
			// 1. 입력창에 입력된 데이터를 가져온다
			var msginput = document.getElementById("msginput").value;
				if( msginput == ""){  return; } // 입력이 없을때 유효성검사 [ 전송 막기 ]
			let today = new Date(); // js에서 현재 날짜/시간 객체 
			var time = today.toLocaleTimeString(); // 시간만 가져오기 
			// 받는 사람 
			var toid = document.getElementById("toid").value;
			
			if( toid == "" ){ // 귓속말 대상이 없으면
				toid="all";	//모두에게 보내기 
			}
			// msg = 보내는사람id , 받는사람 , 보낸시간 , 메시지내용
			var msg = loginid +","+toid+","+time+","+msginput; 	
			
			// 입력된 문자 와 날짜를 채팅발 div 에 추가
			msgbox.innerHTML += "<div class='d-flex justify-content-end mx-2 my-2'><span class='msgtime d-flex align-items-end'>"+time+"</span><span class='from mx-1'>"+msginput+"</span></div>";
				
			webSocket.send( msg );	 // *****************서버로 부터 메시지 전송 
			document.getElementById("msginput").value = "";	// 전송후 입력창 내용물 지우기 [ 초기화 ]
			// 스크롤 있을경우 스크롤 위치를 가장 아래로 이동 
			msgbox.scrollTop = msgbox.scrollHeight; // 현 스크롤 위치 =  스크롤 전체높이[ 바닥 ] */
		}
		// 7. 보내는 메소드 
		function entersend() {
			// 엔터를 눌렀을떄 
			if( window.event.keyCode == 13 ){  	// *** 윈도우 이벤트 키 코드 중에 13번이 엔터
				var msginput = document.getElementById("msginput").value;
					if( msginput == ""){  return; }
				let today = new Date(); 
				var time = today.toLocaleTimeString(); 
				var msg = loginid +","+time+","+msginput;
				msgbox.innerHTML += "<div class='d-flex justify-content-end mx-2 my-2'><span class='msgtime d-flex align-items-end'>"+time+"</span><span class='from mx-1'>"+msginput+"</span></div>";
				webSocket.send( msg );	
				document.getElementById("msginput").value = "";	
		 		msgbox.scrollTop = msgbox.scrollHeight; 
			}
		}
	
	</script>
	
	
	
</body>
</html>



























