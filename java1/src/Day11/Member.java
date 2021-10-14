package Day11;

public class Member {

	public String id;
	
	public Member( String id ) {
		this.id = id;
	}
	
	// object 클래스내 메소드[equals] 오버라이딩
	@Override
	public boolean equals(Object obj) { // 비교할 객체를 인수로 받음 [ 비교대상 ]
		if( obj instanceof Member ) { // instanceof : 상속관계 확인 키워드 
			// Member 클래스에 obj 포함되어 있는지 확인 [true,false]
			Member member = (Member)obj;
			// 인수의 객체를 강제형변환
			if( id.equals(member.id)) {
			// 현재클래스내 변수와 인수의 변수와 비교 
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "현재 객체내 저장된 필드는 : " + this.id;
	}
	
	
	
	
	
	
	
}
