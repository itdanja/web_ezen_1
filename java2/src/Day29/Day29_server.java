package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_server {
	
	// 통신용 서버 만들기 
		// 1. 서버소켓 만들기 [ ServerSocket 클래스 ] 
			// 소켓 : pc간의 통신 종착점 [ server소켓이 허락하여 client 와 연결 ] 
		// 2. 서버소켓 바인딩 하기 
			// 서버에 ip 주소와 port 번호 설정 
			// * port : ip당 6만개 정도 설정된 번호 [ ip내 프로세스 연결 번호 ]
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. 서버소켓 만들기
			serverSocket.bind( new InetSocketAddress("127.168.102.50" , 5000 )); // 2. 서버소켓에 ip , port 설정 
			while(true) {
				System.out.println(" [[ 서버에서 연결 대기중 ]]");
				Socket socket =  serverSocket.accept(); // 3. .accept() : 클라이언트 요청시 수락
				//4. 수락된 클라이언트 소켓 확인 
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(" [[ 클라이언트와 연결이 되었습니다 . 클라이언트 정보 : " + socketAddress.getHostName() );
				
				// 데이터 수신하기 [ 받기 ] : 스트림을 이용한 외부 네트워크 통신 
				InputStream inputStream = socket.getInputStream(); // 소켓 입력 스트림 
				byte[] bytes = new byte[1000];	// 바이트열 배열 선언 
				inputStream.read( bytes );		// 소켓 입력스트림에서 입력받은 바이트를 배열 저장 
				System.out.println(" 클라이언트의 메시지 : " + new String(bytes) ); // 바이트배열 -> 문자열 변환
				// 데이터 송신하기 [ 보내기 ] 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" 클라이언트에게 보낼 메시지 : ");
				String msg = scanner.nextLine();
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				System.out.println(" 클라이언트에게 메시지 전송 성공");
				
			}
		}
		catch (Exception e) {}
	}

	
	
	
	
}





