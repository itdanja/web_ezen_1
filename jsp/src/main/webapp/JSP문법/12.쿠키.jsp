<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 1. 쿠키클래스를 이용한 쿠키 객체 만들기("쿠키명","데이터");
		Cookie cookie = new Cookie( "mycookie" , "아이맥");
		// 2. 쿠키 생명주기
		cookie.setMaxAge(60);	// 쿠키 생명주기[ 1분 ]
		// 3. 쿠키 내용 변경
		//cookie.setValue("애플");
		// 4. 클라이언트[브라우저]에게 쿠키 전달[ 해당 브라우저 쿠키 저장]
		response.addCookie( cookie );
	%>
	<p>쿠키 만들기</p>
	<p>쿠키 내용 <a href="12.쿠키테스트.jsp">확인</a></p>
	
</body>
</html>






