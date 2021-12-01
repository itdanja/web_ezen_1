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

	<%
		String id =request.getParameter("id");
		String password =request.getParameter("password");
		String passwordconfirm =request.getParameter("passwordconfirm");
		String name =request.getParameter("name");
		String birth =request.getParameter("birth");
		String sex =request.getParameter("sex");
		String phone =request.getParameter("phone");
		String address = 
				request.getParameter("address1")+","+ request.getParameter("address2")+","+
				request.getParameter("address3")+","+request.getParameter("address4");
		
		// 유효성검사 
		if( id.length() <5 ){  }
		if( password.length() <5  ){  }
		if( !password.equals(passwordconfirm) ){  }
		if( name == null ){}
		if( birth== null ){}
		if( sex == null ){}
		if( phone.length() != 11 ){}
		if( request.getParameter("address4").indexOf(",") > 0 ){}
		
		// 객체화
		Member member = new Member( id , password , name , birth , sex , phone , address );
		// DB처리
		boolean result =  MemberDao.getmemberDao().membersignup(member);
		if( result ){	// 회원가입 성공
			
		}else{	// 회원가입 실패
			
		}
		
		
	%>

</body>
</html>












