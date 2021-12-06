<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	// 파일 이름 요청
	request.setCharacterEncoding("utf-8");
	String filename1 = request.getParameter("file");
	String filename = new String( filename1.getBytes("UTF-8"), "8859_1");
	
	// 서버내 업로드 폴더 찾기
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload/"+filename);
	// 서버내 업로드 폴더내 파일 찾아서 파일 객체화
	File file = new File( folderpath );
	// 클라이언트에게 응답하기
	response.setHeader("Content-Disposition" , "attachment;filename="+filename+";");
	// 내보내기 [ 스트림(바이트) ]
		// 1. 배열 선언 
		byte[] bytes = new byte[ (int)file.length() ];	// file.legnth : 파일내 바이트 길이 메소드
	if( file.isFile() ){	//file.isFile() : 파일이 있는지 없는지 유무 확인
		BufferedInputStream inputStream = new BufferedInputStream( new FileInputStream(file));
		BufferedOutputStream outputStream = new BufferedOutputStream( response.getOutputStream() );
		int count;
		while( (count = inputStream.read(bytes) ) != -1 ){	// -1은 바이트가 없다 [ 읽어올게 없음 ]
			outputStream.write( bytes , 0 , count );
		}
		inputStream.close();	// 스트림 닫기
		outputStream.close();	// 스트림 닫기
	}
			
	


%>
