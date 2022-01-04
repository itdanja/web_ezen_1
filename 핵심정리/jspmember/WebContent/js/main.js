function login(){
	
	var id = document.getElementsByName("id")[0].value;
	var password =  document.getElementsByName("password")[0].value;
	$.ajax({
	url:"../controller/logincontroller.jsp",
	data : {"id":id,"password":password} ,
	success: function(result){
		if(result==1){
			location.href="main.jsp"
		}else if(result==2){
			location.href="login.jsp"
		}
	} 
	});	
	
	
}

function idcheck() {
	var id = document.getElementsByName("id")[0].value;

	$.ajax({
		
		url : "../controller/idcheckcontroller.jsp",
		data : {"id" : id},
		success : function(result) {
			
			if(result == 1) {
				alert("사용중인 아이디 입니다.")
			}else {
				alert("사용가능한 아이디 입니다.")
			}
		}
	});
}


function signup() {
	var id = document.getElementsByName("id")[0].value;
	var password = document.getElementsByName("password")[0].value;
	var name = document.getElementsByName("name")[0].value;
	$.ajax({
		url : "../controller/signupcontroller.jsp",
		data : {"id" : id , "password":password , "name":name},
		success : function(result) {
			if(result == 1) {
				location.href="main.jsp";
			}else {
				location.href="signup.jsp";
			}
		}
	});
}


















