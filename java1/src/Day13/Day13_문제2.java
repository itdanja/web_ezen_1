package Day13;

import java.util.Scanner;

public class Day13_문제2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean sw = true; // 현재 재생 여부 확인 변수 
		boolean sw2 = true; // true이면 중지상태  false : 실행상태
		
		while(true) {
			System.out.println("1.음악재생 2.영화재생");
			int ch =scanner.nextInt();
			
			if( ch == 1 ) {
				Thread thread = new Music();
				if( sw ) {
					Music.musicstop( sw );
					thread.start();
					sw = false;
				}else {
					Music.musicstop( sw );
					sw = true;
				}
			}else if( ch == 2 ) {
				// 1. 스레드구현 객체 생성 
				Thread thread = new Movie();
				
				if( sw2 ) {
					Movie.moviestop(sw2); // 영화시작 
					thread.start();
					sw2 = false;
				}else {
					Movie.moviestop(sw2);
					sw2= true;
				}
				
			}
			
		}
		
	}
	
	
	
	// 확인문제 
		// 1 : 4
		// 2 :  1. new MusicRunnable() 
		//		2. extends Thread
		//		3. implements Runnable
		// 3 : 4 [ 1은 가장 낮은 우선순위 ]
		// 4 : 2 [ 
		// 5 : 4 [ yield() 실행대기 호출 : 스레드 양보()  ]
		// 6 : 4[ 호출한 스레드가 일시정지 ]  //  1,2,3[중요!!] 
		// 7 : 2 
		// 8 :
			//	
			//  if( Thread.interrupted() { break; }
			//
		// 9 :  ~~~
		// 10 : main 스레드가종료시 다른 스레드 종료 [ thread.setDaemon(true) ] p.618
		// 11 : 1 [ 2,3,4 중요!!]
		// 12 :
		// 13 :
	
	
	
	
	
	
	
	
	

}
