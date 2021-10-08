package Day08;

public class Day08_1 {
		// 실행클래스 => main메소드[ 스레드 ]
	
	
//			상속 : 설계도 연장
//			* 프로젝트마다 클래스 설계 ????? 시간 부족
//			* 상속 : 미리 만들어진 클래스로부터 설계도 
//				제공받아 이어서 새로운 클래스 설계
//				부모클래스[슈퍼클래스]
//				자식클래스[서브클래스]
		// 키워드 
			// 1. extends : 연장하다 [ 설계도 연장 ] 
				// public class 자식클래스명 extends 부모클래스명{  } 
				// 다중 클래스 불가 
			// 2. super : 부모클래스내 멤버 접근 
				// 1. super() : 부모클래스내 생성자 호출 
				// 2. super.필드명/메소드명 : 부모클래스내 필드,메소드 호출
	
			// 3. @Override : 부모클래스내 메소드 재정의 
			
			// 4. final
				// final class CellPhone : 부모클래스로 사용 불가
				// final void powerOn() : 오버라이딩 불가 
	
		//* 오버라이딩 : 동일한 이름을 가진 메소드를 재정의 
		//* 오버로딩 : 동일한 생성자의 이름을 가진 생성자 구분













	
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
