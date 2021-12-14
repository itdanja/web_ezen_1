<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//장바구니 세션 이름 [ 이름 : cart+아이디  값 : cart리스트 ]
	Login login =  (Login)session.getAttribute("login");	// 세션 자료형/클래스 는 object
	String sname = "cart"+ login.getM_id();
	
	String type = request.getParameter("type");
	int p_num = Integer.parseInt( request.getParameter("p_num" ) );
	String p_size = request.getParameter("p_size");
	
	if( type.equals("all") ){	// 모두 삭제 버튼을 눌렀을때
		session.setAttribute(sname, null); // 카트 세션 null 초기화
	}
	else if( type.equals("in") ){ // 개별 삭제 버튼을 눌렀을때
		// 카트 세션 호출 
		ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
		for( Cart cart : carts ){ // 동일한 제품번호 과 사이즈 찾기
			if( cart.getP_num() == p_num && cart.getP_size().equals(p_size) ){
				carts.remove(cart); // 카트에서 해당 제품 삭제 
				break;	// 반복문 종료
			}
		}
	}
%>




