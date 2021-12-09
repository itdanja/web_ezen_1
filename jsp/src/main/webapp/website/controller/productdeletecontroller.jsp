<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


	int p_num = Integer.parseInt( request.getParameter("p_num") );

	// db 처리 
	boolean result =  ProductDao.getProductDao().productdelete(p_num);
	
	if( result ){
		out.print("<script>alert('제품 삭제 되었습니다.');</script>");
		out.println("<script>location.href='../view/admin/dashboard.jsp';</script>");
	}else{
		out.print("<script>alert('제품 등록 실패 되었습니다.[관리자에게 문의]');</script>");
		out.println("<script>location.href='../view/admin/dashboard.jsp';</script>");
	}
	

%>