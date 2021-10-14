package Day11;

public class Day11_1 {

	// p.488 : 10장 예외 확인문제 
		// 1. 4 
			// 1. 사용자 조작 혹은 개발자의 잘못된 코드의 오류를 예외라 한다
			// 2. 실행예외[실행 도중에 예외발생] , 일반예외[실행 전에 예외발생 ]
			// 3. try{ }catch(예외클래스 변수명){}
			// 4. 개발자가 예외클래스를 설계 가능
		// 2. 3
			// 3. finally : 예외 유무 상관없이 실행되는 블럭 [ 항상 실행 ]
		// 3. 4
			// throws : 예외 던지기 => 메소드 안에서 발생된 예외를 메소드 호출된 곳으로 전달 
			// Exception : 예외클래스중에 상위클래스
			// throw : 사용자 예외 생성 
		// 4. 2
		// 5. 3
			// 3: catch( Exception e ) {} catch( ClassNotFoundException ) {}
			// Exception : 예외중에서 상위클래스가 앞에 있을경우 뒤에 있는 자식클래스는 의미없음
		// 6. 10 -> 숫자로 변환 할수 없음
			// 순서도 
				// 1. main 메소드 실행 
				// 2. 03줄 / 04줄 : 배열선언 / 변수 선언 
				// 3. 05줄 : for문실행  [ i는 0부터 2까지 1씩증가 ]
					// i = 0 일때
						// value = Integer.parseInt( strArray[0] ) => 10 => 예외 발생x
				// 4. 12줄 : finally
						// 출력 10
					// i = 1 일때
						// value = Integer.parseInt( strArray[1] ) => a10 => 예외 발생o
				// 5. 10줄 : 형식 예외 캐치
						// 숫자로 변환 할수 없음
				// 6. 12줄 : finally 
						// 출력 10 [ value 기존값 ] 
					// i = 2 일때 
						// value = Integer.parseInt( strArray[2] ) => 인덱스 없음 => 예외발생 
				// 7. 08줄 : 인덱스 예외 캐치 
						// 인덱스를 초과했음 
				// 8. 12줄 : finally 
						// 출력 10 [ value 기존값 ] 
				// 9. 반복문 종료 
		// 7.
			// 아이디가 없을경우 예외클래스 만들기 
			// 비밀번호가 다를경우 예외클래스 만들기 
			
		public static void main(String[] args) {
			
			try {
				login("white", "12345");
			}
			catch (Exception e) {
				System.out.println( e.getMessage() );
			}
			try {
				login("blue", "54321");
			}catch (Exception e) {
				System.out.println( e.getMessage() );
			}
		}
		
		// 로그인 메소드 
		//public static void login( String id , String password ) throws Exception {
		public static void login( String id , String password ) throws NotExistIDException , WrongPasswordException {
			
			if( !id.equals("blue") ) {
				// ! : 부정 연산자 : true => false  / false =>true
				throw new NotExistIDException("아이디가 존재하지 않습니다");
			}
			if( !password.equals("12345") ) {
				throw new WrongPasswordException("패스워드가 다릅니다");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
