package Day01;

import java.util.Scanner; // import : 다른 패키지에서 클래스 가져오기 

public class Day01_5 {

	// 문제2 : 1명의 회원가입 표 만들기 
	/* :  
	[입력변수]
	아이디 , 비밀번호 , 성명 , 이메일  입력받아 출력하기
	
	[출력 예]
	>>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
	 아이디		비밀번호		성명			이메일		
	 qwe		1234		유재석		itdanja@kakao.com
	*/
	public static void main(String[] args) {
	
		// 1. 입력객체 만들기 
		Scanner 입력객체 = new Scanner(System.in);
		
		// 2. 입력받은 값을 변수/객체(메모리) 저장[ 옮기기 ] 
		System.out.print(" 회원가입 아이디 : ");		String 아이디 = 입력객체.next();
		System.out.print(" 회원가입 비밀번호 : "); 		String 비밀번호 = 입력객체.next();
		System.out.print(" 회원가입 성명 : ");			String 성명 = 입력객체.next();
		System.out.print(" 회원가입 이메일 : ");		String 이메일 = 입력객체.next();
		
		// 3. 출력
		System.out.println(">>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>> ");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(아이디+"\t"+비밀번호+"\t"+성명+"\t"+이메일);
		
		
		
	}
	
}















