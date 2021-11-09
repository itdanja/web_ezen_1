package Day29;

import java.net.InetAddress;

public class Day29_1 {
	
	// 네트워크 : 두 대이상의 컴퓨터들을 연결하고 통신할수 있는 것 
		// 통신망 : 전자신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나의 망 
			// LAN , MAN , WAN 
		// 인터넷 : TCP/IP 라는 통신 프로토콜 이용한 컴퓨터 네트워크 
			// 프로토콜 : 규약 , 규칙 , 약속 
	
	// TCP/IP 
		// TCP : Transmission Control Protocol : 통신 제어 
		// IP : Internet Protocol address : 통신 인식 번호 
			// 집주소[ 집 1개 -> 1개 주소 ] : 컴퓨터주소[ 컴퓨터 1개 -> 1개 IP ]
			// 택배 [ 쿠팡 -> 집 ]			:	통신 [ PC방 -> 학원 ]
			// 네이버접속 [ 학원ip ----> 네이버ip ]
				// * ip : 숫자 0~255   , 4자리  , .구분
					// ip는 사람이 사이트마다 외우기 힘듬 ---> 문자 편함
				// * ip --> 문자 : 도메인주소 [ DNS ]
	
		// SERVER PC : 많은 자료를 저장해둔 PC 
	
	// 현재 IP 확인 방법 
		// CMD -> ipconfig 
		// 자바 -> InetAddress 클래스 사용 
	public static void main(String[] args) {
		
		// 1. 현재 pc의 호스트 가져오기 
		try {
			InetAddress inetAddress = InetAddress.getLocalHost(); // 무조건 예외발생
			System.out.println(" 현재 pc의 정보객체 : " + inetAddress );
			System.out.println(" 현재 pc의 이름 : " + inetAddress.getHostName() );
			System.out.println(" 현재 pc의 주소 : " + inetAddress.getHostAddress() );
			
		// 2. 네이버 회사의 호스트 가져오기 
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println(" 네이버의 pc의 정보객체 : " + inetAddress2 );
			System.out.println(" 네이버의 pc의 이름 : " + inetAddress2.getHostName() );
			System.out.println(" 네이버의 pc의 주소 : " + inetAddress2.getHostAddress() );
		
		// 3. 네이버 회사의 다수 ip 확인 
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for( InetAddress address : inetAddresses ) {
				System.out.println(" 네이버 배열내 pc의 이름 : " + address.getHostName() );
				System.out.println(" 네이버 배열내 pc의 주소 : " + address.getHostAddress() );
			}
		
		// 4. 페이스북 회사의 IP 확인 
			InetAddress inetAddress3 = InetAddress.getByName("www.facebook.com");
			System.out.println(" 페이스북 pc의 정보객체 : " + inetAddress3 );
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
	

}





