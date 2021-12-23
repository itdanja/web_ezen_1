package dto;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import javax.servlet.annotation.HttpConstraint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

// @ : 어노테이션 [ 메타데이터 ] : 미리 만들어진 정보(코드,메모리) 를 제공 받음
@ServerEndpoint("/chatting/{rooomnum}") // 1.서버소켓[종작첨] ( 경로생성 )
public class Chatting {
	
	private Integer rooomnum = 0; 
	
	// * 접속된 세션(회원)을 저장하는 리스트 [ Arraylist vs Vector(동기화) ]
	private static Map< Session , Integer > clients =  new Hashtable< Session,Integer>();
	
	// 2. 클라이언트가 서버로부터 접속 요청
	@OnOpen // 소켓 접속하는 어노테이션 
	public void onOpen( Session session , @PathParam("rooomnum") int rooomnum  ) {
		System.out.println(session);
		this.rooomnum = rooomnum;	// 전달받은 인수를 방번호 변수에 저장
		clients.put(  session , this.rooomnum );	// 리스트에 추가 
		//System.out.print( rooomnum );
		//System.out.print( session.getId() ); // 세션 번호 확인 
		//System.out.print("현재 접속한 세션들 : " + clients ); // 현재 접속된 세션들 	
	}
	
	// 3. 클라이언트가 서버로부터 접속 해지
	@OnClose // 소켓 닫는 어노테이션 
	public void onClose( Session session ) {
		clients.remove( session ); // 방 나가기
	}
	// 4.서버가 클라이언트로부터 메시지 받는 메소드 
	@OnMessage	// 메시지를 받는 어노테이션 
	public void onMessage( String msg , Session session ) throws IOException {
							// 메시지 ,  보낸사람[세션]
		for( Session key : clients.keySet() ) {	// 모든 키 가져오기
			if( clients.get(key) == Integer.parseInt( msg.split(",")[0] )) { // 해당 키 에 값 == 방번호
				// 모든 리스트에 저장된[ 접속된 ] 메시지 보내기 
				if( !key.equals(session) ) {	// 본인을 제외한
					// 본인을 제외한 모든 사람에게 
					key.getBasicRemote().sendText(msg);
						// 세션.조작명령어 -> 이벤트실행 -> send -> 클라이언트의 conmessage 실행
				}
			}
		}
		
	}
	/*
	 * 오류 발생시 자동 소켓 닫기 
	 * // 5. 서버가 클라이언트로부터 오류
	 * 
	 * @OnError // 클라이언트 오류 어노테이션 
	 * public void onError( ) {
	 * 
	 * }
	 */
}
