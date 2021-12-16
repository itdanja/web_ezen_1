<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.PorderDao"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Login"%>
<%@page import="dto.Porder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// ajax 이용한 매개변수 요청
	String order_name = request.getParameter("order_name");
	String order_phone =request.getParameter("order_phone");
	String order_address =request.getParameter("order_address");
	int order_pay =Integer.parseInt(request.getParameter("order_pay"));
	String order_payment =request.getParameter("order_payment");
	int delivery_pay =Integer.parseInt(request.getParameter("delivery_pay"));
	String order_contents =request.getParameter("order_contents");
	
	Login login = (Login)session.getAttribute("login"); // 로그인 세션 호출

	// 객체화
	Porder porder = new Porder( login.getM_num(),  order_name ,
			order_phone , order_address ,  
			order_pay , order_payment , 
			delivery_pay , order_contents  );
	
	// 카트 세션 호출
	String sname = "cart"+ login.getM_id(); // 장바구니 세션 이름 [ 이름 : cart+아이디  값 : cart리스트 ]
	ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);

	// DB저장 
	boolean result = PorderDao.getPorderDao().orderwrite(porder , carts);
	if( result ) {
		out.print("1");  session.setAttribute(sname , null); // 장바구니초기화
	}
	else out.print("0");

// 순서 [ 1.주문db등록한다 -> 2.주문 상품수만큼 주문상세 등록 ]
	// 1. 주문 등록 
		// 1. 회원번호 : m_num	 : 세션 
		// 2. 수령자 : order_name 
		// 3. 수령자연락처 :order_phone	
		// 4.수령자주소 :order_address
		// 5.주문총금액 : order_pay
		// 6.결제수단 : order_payment
		// 7.배송비 : delivery_pay
		// 8.배송요청사항 : 
	// 2. 주문 상세  [ 먼저 주문 등록이 된다는 가정 ] : 반복문
		// 1.오더번호 : order_num : DB
		// 2.상품번호 : p_num : 카트 세션
		// 3.구매수량 : p_count : 카트 세션 
		// 4.배송상태 : delivery_state : 임의값[1]
	// 3. 재고 감소 [제품 업데이트]
	// 4. 카트세션 초기화	
%>
