<%@page import="java.util.Set"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

// 서버로 파일 업로드 
	//* 현재 작업폴더 업로드
	//String folderpath ="C:/Users/505-t/git/web_ezen_1/jsp/src/main/webapp/website/upload";
	//* 서버 실제 경로
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload");
	MultipartRequest multi = new MultipartRequest( request ,  folderpath , 
			1024*1024*10 ,"UTF-8" , new DefaultFileRenamePolicy() );
	////////////////////
	request.setCharacterEncoding("utf-8");	// 요청시[request] 한글 인코딩
	String title = multi.getParameter("title");
	String contents = multi.getParameter("contents");
		// 1. html < > -> 문자 변환 [ 정규표현식x ]
		// 2. \n -> <br> 줄바꿈 변환
	contents = contents.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");
		// 3. html < > -> 문자 변환 [ 정규표현식 ]
	title = title.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\S)*(/)?","");
	
	
	String file = multi.getFilesystemName("file");	// getFilesystemName : 파일명 가져오기
	/////////////////////////
					/* 	// 요청 [ 일반 form ]
						String title = request.getParameter("title");
						String contents = request.getParameter("contents");
						String file = request.getParameter("file"); */
	// 작성자의 회원번호
	Login login =  (Login)session.getAttribute("login");
	int m_num = login.getM_num();
	// 객체화
	Board board = new Board( title , contents , m_num , file);
	// DB처리
	BoardDao.getboarddao().boardwrite( board);
	
	response.sendRedirect("../view/board/boardlist.jsp");
	
%>










