<%@page import="dto.Login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 선택한 제품의 제품번호 , 옵션 , 수량
	int p_num = Integer.parseInt(request.getParameter("p_num") );
	String p_size = request.getParameter("p_size");
	int p_count = Integer.parseInt(request.getParameter("p_count") );
	// 객체화
	Cart cart = new Cart( p_num , p_size , p_count );
	
		// 장바구니 세션 이름 [ 이름 : cart+아이디  값 : cart리스트 ]
		Login login =  (Login)session.getAttribute("login");	// 세션 자료형/클래스 는 object
		String sname = "cart"+ login.getM_id();
		
		// 기존 카트가 있을경우 없을경우 
		ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);	// 1. 카트세션 호출
		
		if( carts == null ){ // 2.카트세션이 없을경우 
			carts = new ArrayList<>();	// 3. 카트리스트에 메모리할당
			carts.add( cart );			// 4. 카트리스트에 제품 추가 
			// 세션에 저장
			session.setAttribute(sname, carts);	// 5. 카트세션 생성 
		}else{					// 6. 카트세션이 있을경우
			// 만약에 기존 카트에 동일한 제품이 있을경우 
			boolean pcheck = true;	// 중복체크 변수 
			for( Cart temp : carts ){
				// 카트에 제품번호와 제품사이즈가 동일하면
				if( temp.getP_num() == p_num 
						&& temp.getP_size().equals(p_size) ){
					// 기존 제품에 수량을 추가 
					temp.setP_count( temp.getP_count() + p_count );
					pcheck = false;	// 중복이 있으면 false 
				}
			}
			if( pcheck )carts.add( cart );	// 7.동일한 제품이 없을경우에 카트리스트에 제품 추가 
			session.setAttribute(sname, carts); // 8.세션 생성 [ 업데이트 ]
		}
		
		
	// 비동기식 사용시 페이지 전환 x
	//response.sendRedirect("../view/product/productcart.jsp");
%>



