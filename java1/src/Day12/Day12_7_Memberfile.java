package Day12;

import java.util.Scanner;

public class Day12_7_Memberfile {

	/* ȸ���� ���α׷� ( ����ó�� ) 
	 *  �α���/ȸ������ ���α׷� [ ����ó�� ]
			// [����] : ȸ�����Խ� ȸ������ ���Ͽ� ���� 
				// [ȸ��Ŭ����] : ���̵� , ��й�ȣ , ���� , ����ó
			// [����] : �α��ν� ���ϳ� ȸ�������� �����ϸ� �α��� ����
	 */
	
	// 1. �Է¹ޱ� -> 2.��ü���� -> 3.���Ͼ���[out] : �ʵ�
	// * ������ : 1.ȸ������ 2.ȸ���� �ʵ屸��
	
	// 0.���� [ main �޼ҵ� �ۿ� �����ϴ� ���� : �ٸ� Ŭ������ �޼ҵ尡 �����Ҽ� �ֵ��� ] 
	public static Scanner scanner = new Scanner(System.in);
		// [ static ����ϴ����� : main �޼ҵ�ó�� �޸� �켱 �Ҵ� ] 
	
	public static void main(String[] args) {
		
		while(true) {
			Member temp = new Member();
			temp.signup();
		}
		
	}
}










