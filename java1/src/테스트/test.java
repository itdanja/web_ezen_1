package �׽�Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] intarr = new int[5];
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			// �Է¹��� ���� �迭�� ���� 
			intarr[i] = scanner.nextInt();
			sum += intarr[i];
			
		}
		System.out.println("1���� 5������ �� = " + sum);
		System.out.println(" �迭 Ȯ�� : " + Arrays.toString( intarr) );
	}

}
