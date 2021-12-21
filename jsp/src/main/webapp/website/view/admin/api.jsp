<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="../header.jsp" %>

	
		<div class="container">
			<table class="table">
			<% // api 가져오기 [ json 형식 ]
			// 1. 요청 URL 가져오기 		
			URL url = new URL("https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=300&serviceKey=z427Q0DLkQqM0SDOc1Lz8jPzk%2BKj0ng%2Bvz7h3I8CpVs3T90219bWi2o%2BmStIxJW%2B9lwayA%2FsAT6apxsxuvydQg%3D%3D");
			// 2. 스트림 버퍼를 통한 URL내 HTML 읽어오기 							// 호출 개수 : page="시작번호"&perpage="마지막번호"
			BufferedReader bf = new BufferedReader( new InputStreamReader( url.openStream() , "UTF-8") );
				// BufferedReader : 외부[이클립스외 ] 입출력 버퍼[ 통신 데이터 저장소 ] // InputStreamReader( 스트림 , "인코딩타입" ) : 입출력 스트림  // url.openStream() : 바이트 단위로 url 내용 읽기 
			// 3. 읽어온 내용 문자열 담기 
			String result = bf.readLine();	// .readLine() : 모든 문자열 읽어오기 
				// System.out.println("url내 문서 스트림 이용한 읽어오기[ String ] : " +  result );
			// 3. 읽어온 내용을 json으로 파싱 하기
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = ( JSONObject)jsonParser.parse(result);
				// 1.JSONparser json데이터 넣어서 파싱  // 2.jsonobject 형 변환  
				// System.out.println("rul 내용을 json 변환[ json ] : " +  jsonObject );
			JSONArray jsonArray = (JSONArray)jsonObject.get("data");
				// "data" 라는 키 요청 해서 리스트 담기  
				// System.out.println("data 키 호출 해서 리스트 담기 : " +  jsonArray );
			for( int i = 0 ; i<jsonArray.size() ; i++ ){
				JSONObject content = (JSONObject)jsonArray.get(i);
				// 반복문 통한 리스트내  i번째 호출
					// System.out.println( content );
			%>
				<tr>
					<td><%=content.get("facilityName") %></td>				<!--  json명.get("키")  -->
					<td><%=content.get("address") %></td>
					<td><%=content.get("phoneNumber") %></td>
					<td> <button onclick='map(<%=i%> , <%=content.get("lat") %> , <%=content.get("lng") %>)'> 지도보기 </button>
					</td>
				</tr>
				<tr>
					<td colspan="4"> <div id="map<%=i %>" style="width:100%;height:350px;"></div> </td>
				</tr>
			<%
		}
		%>
		</table>
	</div>
</body>
</html>







