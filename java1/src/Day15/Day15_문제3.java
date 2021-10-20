package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_문제3 {

	/*
	 * 
	 *  
	문제3 :  지하철 관제 ( Queue )
		[조건1] : 역 4개 ( 종점역 -> 용산 -> 서울 ->구로-> 종점역 )
		[조건2] : 전철 3개 객체 [ 종점역에 3개 전철 대기 ]
		[조건3] : 출발 신호를 받아서 해당역에서 출발해서 다음으로 도착 
		[조건4] : 역 당 소요시간 2초
	
		출발신호 메뉴 
		1. 종점 2.용산 3.서울 4.구로 
	
		[ 예시 ] 1번 선택시 종점역에 먼저 들어온 전철을 다음역으로 이동 
		[ 예시 ] 만일 해당역에 전철이 없으면 없다 출력 
	
		[출력 예 ]
			----현 전철역  현황 -----
			종점역 :  전철3 , 전철4
			용산역 :  전철2
			서울역 :  전철1 
			구로역 :  
			---------- 출발 신호 --------
			1. 종점 2.용산 3.서울 4.구로 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		Queue<String> 종점역 = new LinkedList<String>();
		Queue<String> 용산역 = new LinkedList<String>();
		Queue<String> 서울역 = new LinkedList<String>();
		Queue<String> 구로역 = new LinkedList<String>();
		
		종점역.offer("1번전철");
		종점역.offer("2번전철");
		종점역.offer("3번전철");
		
		while(true) {
			System.out.println(종점역);
			System.out.println(용산역);
			System.out.println(서울역);
			System.out.println(구로역);
			System.out.println("1.종점 2.용산 3.서울 4.구로");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println(종점역);
				if(!종점역.isEmpty()) {
					Thread.sleep(2000);	
					System.out.println("출발 : "+종점역.peek());
					용산역.offer( 종점역.poll() );
				}
			}
			if(ch==2) {
				System.out.println(용산역);
				if(!용산역.isEmpty()) {
				Thread.sleep(2000);
				System.out.println("출발 : "+용산역.peek());
				서울역.offer(용산역.poll());
				}
			}
			if(ch==3) {
				System.out.println(서울역);
				if(!서울역.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("출발 : "+서울역.peek());	
				구로역.offer(서울역.poll());
				}
			}
			if(ch==4) {
				System.out.println(구로역);
				if(!구로역.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("출발 : "+구로역.peek());	
				종점역.offer(구로역.poll());
				}
			}
		}
	}
}
