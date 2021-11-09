package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChattingController implements Initializable {
	
	// 1. 클라이언트 소켓 선언 
	Socket socket;
	// 2. 클라이언트 시작 메소드
	public void clientstart( ) {
		// 멀티스레드 [ 스레드풀 x ]
		Thread thread = new Thread() {
			
				@Override
				public void run() {
					// 접속하기 
					try {
						socket = new Socket("127.0.0.1" , 1234 );	// 서버소켓에 바인딩된 ip와 port
						receive();
					}catch (Exception e) {}
				}
		};
		thread.start(); // run 메소드 실행[ 스레드풀이 아닌경우 직접 실행 ]
	}
	// 3. 클라이언트 종료 메소드 
	public void clientstop( ) {  try{ socket.close(); }catch (Exception e) { }  }
	
	// 4. 메시지 보내기 메소드 
	public void send( String msg ) {
		// 멀티스레드 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();	// 1.출력 스트림
					outputStream.write( msg.getBytes() );					// 2.인수로 받은 메시지를 바이트형 변환해서 내보내기
					outputStream.flush();
				}
				catch (Exception e) {}
			}
		};
		thread.start();
	}
	// 5. 메시지 받는 메소드 
	public void receive() {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();		// 1. 입력 스트림
				byte[] bytes = new byte[1000];	// 바이트 배열 선언 
				inputStream.read(bytes );								// 2. 입력스트림내 바이트를 읽어오기 
				String msg = new String(bytes);							// 3. 바이트배열 ->> 문자열 변환 
				Platform.runLater( () -> txtclient.appendText(msg) ); 	// 4. 받은 문자열을 메시지창에 띄우기 
			}
			catch (Exception e) {}
		}
	}
	
	private String loginid = MainpageController.getinstance().getloginid();
	
	// 6. 입력 버튼을 눌렀을때 
	@FXML
	void msgsend( ActionEvent event ) {
		// 메시지 보내기 
		send( loginid +" : " +  txtcontents.getText() +"\n" );
		// 보내기 후 
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	// 7. 엔터를 눌렀을때 
	@FXML
	void send( ActionEvent event ) {
		// 메시지 보내기 
		send( loginid +" : " + txtcontents.getText() +"\n" );
		// 보내기 후 
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtclient.setEditable(false); // 수정금지 
		txtcontents.setDisable(true); // 사용금지 
		btninput.setDisable(true); // 사용금지 
	}
	@FXML
	private TextArea txtclient;
	@FXML
	private TextField txtcontents;
	@FXML
	private Button btninput;
	@FXML
	private Button btnconnect;
	
	@FXML
	void connect( ActionEvent event ) {
		if( btnconnect.getText().equals("접속하기")) {
			// 1. 클라이언트 실행 
			clientstart();
			// 2. 접속 메시지 전달 
			Platform.runLater( ()-> txtclient.appendText(" --- [ 채팅방 접속 ] ---\n")  );
			// 3. 컨트롤 내용 변경 
			btnconnect.setText("나가기");
			txtcontents.setDisable(false); // 사용가능
			txtcontents.requestFocus(); // 마우스 포인터 이동
			btninput.setDisable(false); // 사용가능
			
		}else {
			// 1. 클라이언트 종료
			clientstop();
			// 2. 퇴장 메시지 전달 
			Platform.runLater( ()-> txtclient.appendText(" --- [ 채팅방 퇴장 ] ---\n")  );
			// 3. 컨트롤 내용 변경 
			btnconnect.setText("접속하기");
			txtcontents.setDisable(true); // 사용금지
			btninput.setDisable(true); // 사용금지
			
		}
	}
	
	
	
	
}






