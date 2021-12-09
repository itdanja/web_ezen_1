<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String folderpath = "C:/Users/505-t/git/web_ezen_1/jsp/src/main/webapp/website/upload";
	MultipartRequest multipartRequest = new MultipartRequest( 
			request , folderpath , 1024*1024*100 ,"UTF-8",new DefaultFileRenamePolicy() );
	
	// 객체화
	Product product = new Product( 
			multipartRequest.getParameter("p_name") , 
			Integer.parseInt(multipartRequest.getParameter("p_price")) ,
			multipartRequest.getParameter("p_category") ,
			multipartRequest.getParameter("p_manufacturer") ,
			Integer.parseInt(multipartRequest.getParameter("p_active")),
			multipartRequest.getParameter("p_size"),
			Integer.parseInt(multipartRequest.getParameter("p_stock")),
			multipartRequest.getFilesystemName("p_img"),
			multipartRequest.getParameter("p_contents") );
	// DB 처리 
	boolean result = ProductDao.getProductDao().productwrite(product);
	if( result ){
		out.print("<script>alert('제품 등록 되었습니다.');</script>");
		out.println("<script>location.href='../view/admin/dashboard.jsp';</script>");
	}else{
		out.print("<script>alert('제품 등록 실패 되었습니다.[관리자에게 문의]');</script>");
		out.println("<script>location.href='../view/admin/productwrite.jsp';</script>");
	}
	
	
	
	
	
	
	
%>