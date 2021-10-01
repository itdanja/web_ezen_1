package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2_가위바위보 {
	
	// 가위바위보 
		// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기 
		// 2. 컴퓨터는 랜덤으로 가위바위보 [0~2] 중 하나 선택 
		// 3. 승리한 플레이어 호출 
			// + : 만약에 종료[3]를 입력하면 게임종료 
			// + : 게임종료시 게임수 와 최종승리[ 가장 많이 이긴 플레이어 호출 ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 필요 변수 개수 // 2. 키보드로 입력 // 3. 난수 생성 // 4. 제어[승리자 판단] 
		int 플레이어;
		int 컴퓨터;
		int 게임수 = 0; // 게임수를 저장하는 변수 [ while문의 반복횟수 ]
		int 플레이어승리수 =0 ; int 컴퓨터승리수 = 0 ;
		
		while(true) {
			
			// 1.사용자로부터 입력받기
			System.out.println(" --------------[[ 가위바위보 게임 ]] ----------- ");
			System.out.print(" >>>>>>>  가위[0] 바위[1] 보[2] 종료[3] 중 선택 : ");
			플레이어 = scanner.nextInt();
				// 4. 3번 입력시 게임 종료 
				if( 플레이어 == 3 ) {
					System.out.println(" >>>>>>> [게임종료] : 게임횟수 :  " + 게임수);
					if( 플레이어승리수 > 컴퓨터승리수 ) { 
						System.out.println(" >>>>>>> [ 최종승리자 ] : 플레이어 " + 플레이어승리수  );
					}else if( 플레이어승리수 < 컴퓨터승리수 ) {
						System.out.println(" >>>>>>> [ 최종승리자 ] : 컴퓨터 " + 컴퓨터승리수  );
					}else {
						System.out.println(" >>>>>>> [ 최종승리자 ] : 무승부 "  );
					}
					break; // 가장 가까운 반목문 탈출
				
				}	
				// 5. 0~3 외 숫자 입력시 
				if( 플레이어 < 0 || 플레이어 > 3 ) {
					System.out.println("  >>>>>>> [알수없는 번호 입니다 : 다시 입력 ] ");
					continue; // 가장 가까운 반목문 이동 
				}
				
			// 2. 컴퓨터로부터 난수 생성 
			Random random = new Random(); // 난수 객체
			컴퓨터 = random.nextInt(3); // 0~2 사이 난수 
			System.out.println(" >>>>>>> 컴퓨터가 낸 수 : " + 컴퓨터);
			
			// 3. 플레이어 승리자 판단 [ 플레이어=가위 && 컴퓨터==보 이거나 바위,가위 이거나 보,바위  ]
			if( (플레이어==0 && 컴퓨터== 2) || (플레이어==1 && 컴퓨터==0) || (플레이어==2 && 컴퓨터==1) ) {
				System.out.println(" >>>>>>> 플레이어 승리");
				플레이어승리수++; // 승리수 증가
			}
			// 무승부 판단 
			else if( (플레이어==0 && 컴퓨터==0) || (플레이어==1 && 컴퓨터==1) || (플레이어==2 && 컴퓨터==2) ){ 
				System.out.println(" >>>>>>>> 무승부 ");
			}
			else { // 컴퓨터 승리
				System.out.println(" >>>>>>>> 컴퓨터 승리");
				컴퓨터승리수++; // 승리수 증가
			}
			
			게임수++; // 게임수 증가 
			
		} // while end 
	} // main end 
} // class end 





