<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 자바 스크립트 위치 : html -> body	//  css ->head </h3>
		<script type="text/javascript">
			var 메시지 = "자바 스크립트";	// variable -> var : 변수 선언 자료형
			for( var i = 0 ; i<5 ; i++ ){	// 반복문
				// 내장객체[ document : 미리 정의된 객체 ]
					// 현html문서 접근 가능
				document.writeln(메시지+"<br>");
			};
			// 스크립트 한줄 주석처리 [ 자바 동일 ]
			/* 여러줄 주석 */
		</script>

</body>
</html>