package dto;

import java.io.IOException;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

// @ : 어노테이션 [ 메타데이터 ] : 미리 만들어진 정보(코드,메모리) 를 제공 받음
@ServerEndpoint("/chatting2") // 1.서버소켓[종작첨] ( 경로생성 )
public class Chatting {
	
	// * 접속된 세션(회원)을 저장하는 리스트 [ Arraylist vs Vector(동기화) ]
	private static Vector<Session> clients = 
			new Vector<Session>();
		
	// 2. 클라이언트가 서버로부터 접속 요청
	@OnOpen // 소켓 접속하는 어노테이션 
	public void onOpen( Session session ) {
		clients.add(session);	// 리스트에 추가 
	}
	// 3. 클라이언트가 서버로부터 접속 해지
	@OnClose // 소켓 닫는 어노테이션 
	public void onClose( Session session ) {
		clients.remove(session); // 리스트에 제거
	}
	
	// 4.서버가 클라이언트로부터 메시지 받는 메소드 
	@OnMessage	// 메시지를 받는 어노테이션 
	public void onMessage( String msg , Session session ) throws IOException {
		// 인수 : 메시지 , 보낸 세션(회원)
		for( Session client : clients ) {
			// 모든 리스트에 저장된[ 접속된 ] 메시지 보내기 
			if( !client.equals(session) ) {
				// 본인을 제외한 모든 사람에게 
				client.getBasicRemote().sendText(msg);
			}
		}
	}
	// 5. 서버가 클라이언트로부터 오류 
	@OnError // 클라이언트 오류 어노테이션
	public void onError( Session session  ) {
		
	}

}
