package Day09;

public interface ATM {
	// 1. 상수 필드
	// 2. 추상 메소드 [ 선언만 하고 실행코드 정의x ]
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	// 3. 디폴트 메소드 
	default void 실행() {System.out.println(" ATM 실행 합니다 ");}
	// 4. 정적 메소드 
	
}
