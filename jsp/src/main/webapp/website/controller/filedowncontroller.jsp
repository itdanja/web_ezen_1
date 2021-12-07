<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	// 1. 경로에서 파일명 가져오기 [ 조건 : ../../controller/filedowncontroller.jsp?file=파일명 ]
	request.setCharacterEncoding("utf-8");
	String filename = request.getParameter("file");
	// 2. *서버내 업로드폴더에서 파일 찾기
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload/"+filename);
						// request.getSession().getServletContext().getRealPath() : 서버내 경로찾기
	// 2. *작업폴더 경로에서 파일 찾기 
	//String folderpath = "C:/Users/505-t/git/web_ezen_1/jsp/src/main/webapp/website/upload/"+filename; 
	// 3. 파일 객체화
	File file = new File( folderpath );
	// 4. 다운로드 형식변경
	response.setHeader( "Content-Disposition" , "attachment;filename="+filename+";");
		// setHeader("다운로드형식html" , 다운로드형식에 표시할 파일명 )
	// 내보내기 [ 스트림(바이트) ]
		// 2. 만약에 파일이 존재하며
		if( file.isFile() ){	//file.isFile() : 파일이 있는지 없는지 유무 확인
			
			// 3.입력스트림 [ 파일을 바이트형으로 읽어오기 ]
			BufferedInputStream inputStream = new BufferedInputStream( new FileInputStream(file));
			byte[] bytes = new byte[ (int)file.length() ];	// file.legnth : 파일 바이트 길이 호출 메소드
			inputStream.read( bytes );
			
			// 3.출력스트림 [ 읽어온 바이트형 파일을 내보내기 ] // response.getOutputStream() : 클라이언트에게 바이트 전송
			BufferedOutputStream outputStream = new BufferedOutputStream( response.getOutputStream() );
			outputStream.write( bytes );
			
			inputStream.close();	// 입력 스트림 닫기
			outputStream.close();	// 출력 스트림 닫기
		}


%>
