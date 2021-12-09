/* 다음주소 api */
function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
            
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            } else {
                document.getElementById("sample4_extraAddress").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}
/* 다음주소 api end */

/* 회원탈퇴 [ ajax : jquery  ] */ 

	// $( function(){ 실행문 });	: js함수 정의하기
	$( function(){ 
		// 버튼을 클릭했을때 이벤트 걸기 
		$("#delete").click( function(){ 
			// ajax : 비동기식 통신 [ 페이지전환없이 통신 ]
				//$.ajax({ 속성명:값 , 속성명:값 , 속성명:값  });
			$.ajax({
				url : "../../controller/memberdeletecontroller.jsp" ,
				/* url : 통신 경로 */
				data : {password:document.getElementById("deleteform").password.value} ,
				/* data : { 변수명 : 값 } */ 
				success : function( result  ){
					if( result == 1 ){
						alert('회원탈퇴 되었습니다');
						location.href='../../controller/logoutcontroller.jsp';
					}else{
						document.getElementById("deleteresult").innerHTML = "회원정보가 다릅니다.";
					}
				
				}
			});
		} ); // 버튼 클릭했을때 함수 끝
	 }); // 전체 함수 끝 

	

/* 회원탈퇴 */

/* 아이디 중복체크 [ ajax ] */
	$( function(){
		// $("id명").이벤트명( 함수명(){ 실행코드; } );
		$("#id").change( function() { 
			// 비동기식 : $.ajax({ 속성명 : "값" , 속성명 : "값" , 속석명 : "값" });
			$.ajax({ 
				url : "idcheck.jsp" ,	
				/* url : 통신할 경로 페이지 */ 
				data :{userid:document.getElementById("signupform").id.value} , 	
				/* 이동할 데이터 */
				success : function( result ){ 
				/* 통신이 성공했을때*/
					if( result == 1 ){ 	// js 변수는 자료형 없다
						document.getElementById("idresult").innerHTML = "사용중인 아이디";
					}else{
						
					}
				}
			});
		});
	});
/* 아이디 중복체크 end */



	function namechange(){ 
		
		// 1. 클릭했을때 html 수정
		document.getElementById("tdname").innerHTML = "<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>";
	
		$( function(){
			// $("id명").이벤트명( 함수명(){ 실행코드; } );
			$("#namechangebtn").click( function() { 
				$.ajax({ 
					url : "../../controller/memberupdate.jsp" ,	
					/* url : 통신할 경로 페이지 */ 
					data :{ newname:document.getElementById("name").value} , 	
					/* 이동할 데이터 */
					success : function( result ){ 
					/* 통신이 성공했을때*/
						if( result == 1 ){ 	// js 변수는 자료형 없다
							document.getElementById("tdname").innerHTML =  document.getElementById("name").value;
						}else{
							alert("[ 수정 오류 : 관리자에게문의]");
						}
					}
				});
			});
		});
	}
	


/* 회원가입 유효성검사 */
	function signupcheck(){
	
		// 1. 폼 가져오기 [ 폼에 id 존재 ]	//	document.getElementById("signupform")
		// 2. 폼내 아이디 입력 input 가져오기
		var id = document.getElementById("signupform").id.value;
		var password = document.getElementById("signupform").password.value;
		var passwordconfirm = document.getElementById("signupform").passwordconfirm.value;
		var name = document.getElementById("signupform").name.value;
		var birth = document.getElementById("signupform").birth.value;
		var phone = document.getElementById("signupform").phone.value;
		var sex1 = document.getElementById("signupform").sex1.checked;	// checked 유무 가져오기 
		var sex2 = document.getElementById("signupform").sex2.checked;

		// 3. 유효성검사 [ 정규표현식 : 텍스트 패턴 검사 ] 
		var idj = /^[a-z0-9]{5,15}$/;		// 아이디 정규표현식	[ 소문자 숫자 5~15]
		var pwj = /^[A-Za-z0-9]{5,15}$/;	// 비밀번호 정규표현식[ 대,소문자 숫자 5~15]
		var phonej = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/; // 연락처
		var namej = /^[A-Za-z0-9가-힣]{1,15}$/;	// 이름 정규표현식
		
		// 아이디 
		if( !idj.test( id ) ){
			document.getElementById("idresult").innerHTML="아이디는 소문자와 숫자 조합 5~15 사이만 가능 합니다";
			document.getElementById("idresult").style.color = "red";
			return false;// form submit 불가
		}else{
			document.getElementById("idresult").innerHTML="사용가능한 아이디 입니다."
			document.getElementById("idresult").style.color = "green";
		}
		
		// 패스워드 [ 두 패스워드 동일한지 검사 ]
		
		if( !pwj.test(password) || !pwj.test(passwordconfirm) ){
			document.getElementById("pwresult").innerHTML="대소문자 조합 5~15 사이만 가능합니다."; return false;
		}else if( password != passwordconfirm){
			document.getElementById("pwresult").innerHTML="패스워드가 동일하지 않습니다.";	return false;
		}else{
			document.getElementById("pwresult").innerHTML="사용가능한 패스워드 입니다.";
		}
		// 이름
		if( !namej.test(name) ){
			document.getElementById("nameresult").innerHTML="이름을 입력해주세요.[특수문자는 제외]"; return false;
		}else{
			document.getElementById("nameresult").innerHTML="";
		}
		//생년월일
		if( birth == ""){
			document.getElementById("birthresult").innerHTML="생년월일 선택해주세요"; return false;
		}else{
			document.getElementById("birthresult").innerHTML="";
		}
		// 성별
		if( !sex1 && !sex2 ){  // 둘다 false 이면 // 둘다 체크를 안했으면
			document.getElementById("sexresult").innerHTML="성별을 선택해주세요"; return false;
		}else{
			document.getElementById("sexresult").innerHTML="";
		}
		// 전화번호 
		if( !phonej.test( phone ) ){
			document.getElementById("phoneresult").innerHTML="전화번호 형식으로 입력해주세요."; return false;
		}else{
			document.getElementById("phoneresult").innerHTML="";
		}
	}

/* 회원가입 유효성검사 end */

/* 제품 상태변경 */

	
function activeupdate( p_num ){ // function : 함수만들기 
	
		// confirm : 확인/취소 알람 띄우기 
	if ( confirm("상태변경하시겠습니가?") == true ){ // 확인 버튼 눌렀을때
		// 동기식
			// location.href('../../controller/productdeletecontroller.jsp?p_num='+p_num);
		// 비동기식
		// ajax 통신으로 상태를 다음 상태로 변경
			// $( function(){ 실행문 }); : jquery
		$( function(){
			$.ajax({ 
				url : "../../controller/productactivcontroller.jsp" ,
				data : { p_num : p_num  } ,
				success : function( result ){
					if( result == 1 ){ // js 자료형이 없다
						// 현재 페이지 초기화 [ 현재페이지 refresh ]
						location.reload(); // jquery 메소드
					}else{
						alert("변경 실패 [ 관리자에게 문의] ");
					}
				}
			  });
		});
		
	}
	
}

/* 제품 상태변경 end */










































