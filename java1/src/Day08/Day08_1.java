package Day08;

public class Day08_1 {
		// 실행클래스 => main메소드[ 스레드 ]
	
	public static void main(String[] args) {
		
		// 서브클래스 이용한 객체 생성 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : " + dmbCellPhone.model );	// 부모 필드 접근  // private 변수가 아닐경우 멤버 접근 가능 
		System.out.println("색상 : " + dmbCellPhone.color );	// 부모 필드 접근 
		
		System.out.println("채널 : " + dmbCellPhone.channel ); // 본인 필드 
		
		// 부모 메소드 
		dmbCellPhone.powerOn(); 
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동 입니다" );
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		// 본인 메소드 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
	
}
