package dto;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chatting") // 1.서버소켓[종작첨] ( 경로생성 )
public class Chatting {
	
	// 2. 클라이언트가 서버로부터 접속 요청
	@OnOpen // 소켓 접속하는 어노테이션 
	public void onOpen( Session session ) {
		
	}
	// 3. 클라이언트가 서버로부터 접속 해지
	@OnClose // 소켓 닫는 어노테이션 
	public void onClose( Session session ) {
		
	}
	
	// 4.서버가 클라이언트로부터 메시지 받는 메소드 
	@OnMessage	// 메시지를 받는 어노테이션 
	public void onMessage( String msg , Session session ) {
		
	}
	
	// 5. 서버가 클라이언트로부터 오류 
	@OnError // 클라이언트 오류 어노테이션
	public void onError( Session session  ) {
		
	}

}
