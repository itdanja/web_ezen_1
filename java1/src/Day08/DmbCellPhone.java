package Day08;

public class DmbCellPhone extends CellPhone  {
					// extents : 연장하다 // 상속 1개 

	// 핸드폰 기본기능 => CellPhone 상속
	// 1. 필드 
	int channel;
	// 2. 생성자 
	public DmbCellPhone( String model , String color , int channel ) {
		// this : 현재 클래스내 멤버 
		this.model = model;	// 부모클래스내 멤버 사용 
		this.color = color;	// 부모클래스내 멤버 사용 
		this.channel = channel; // 본인클래스 멤버 사용
	}
	// 3. 메소드 
	void turnOnDmb() {System.out.println("채널 : " + channel +"번 DMB 방송 수신을 시작합니다");}
	void changeChannelDmb( int channl ) {
		this.channel = channl;
		// this.chaanel : 파랑색 => 현재 클래스내 멤버
		// channel : 빨강색 => 메소드에 외부로부터 들어온 변수 [ 인수 ]
		System.out.println("채널 : "+channl +"번으로 바꿉니다");
	}
	void turnOffDmb() {System.out.println("DMB방송 수신을 멈춥니다");}
}
