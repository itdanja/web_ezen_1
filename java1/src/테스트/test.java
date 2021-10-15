package 테스트;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] intarr = new int[5];
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			// 입력받은 값을 배열에 저장 
			intarr[i] = scanner.nextInt();
			sum += intarr[i];
			
		}
		System.out.println("1부터 5까지의 합 = " + sum);
		System.out.println(" 배열 확인 : " + Arrays.toString( intarr) );
	}

}
