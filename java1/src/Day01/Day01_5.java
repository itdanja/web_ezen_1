package Day01;

import java.util.Scanner; // import : �ٸ� ��Ű������ Ŭ���� �������� 

public class Day01_5 {

	// ����2 : 1���� ȸ������ ǥ ����� 
	/* :  
	[�Էº���]
	���̵� , ��й�ȣ , ���� , �̸���  �Է¹޾� ����ϱ�
	
	[��� ��]
	>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>
	 ���̵�		��й�ȣ		����			�̸���		
	 qwe		1234		���缮		itdanja@kakao.com
	*/
	public static void main(String[] args) {
	
		// 1. �Է°�ü ����� 
		Scanner �Է°�ü = new Scanner(System.in);
		
		// 2. �Է¹��� ���� ����/��ü(�޸�) ����[ �ű�� ] 
		System.out.print(" ȸ������ ���̵� : ");		String ���̵� = �Է°�ü.next();
		System.out.print(" ȸ������ ��й�ȣ : "); 		String ��й�ȣ = �Է°�ü.next();
		System.out.print(" ȸ������ ���� : ");			String ���� = �Է°�ü.next();
		System.out.print(" ȸ������ �̸��� : ");		String �̸��� = �Է°�ü.next();
		
		// 3. ���
		System.out.println(">>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>> ");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
		
		
		
	}
	
}















