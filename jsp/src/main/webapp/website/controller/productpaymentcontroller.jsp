<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String order_name = request.getParameter("order_name");
String order_phone =request.getParameter("order_phone");
String order_address =request.getParameter("order_address");
int order_pay =Integer.parseInt(request.getParameter("order_pay"));
String order_payment =request.getParameter("order_payment");
int delivery_pay =Integer.parseInt(request.getParameter("delivery_pay"));
String order_request =request.getParameter("order_request");
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
out.print( order_name + order_phone + order_address + order_pay + order_payment + delivery_pay   );

%>
