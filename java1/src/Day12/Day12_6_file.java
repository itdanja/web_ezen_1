package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_6_file {
	
	// �޸�[�ֱ����ġ=RAM] : ���� , �迭 , ��ü ��� : ���α׷� ����� �� �ʱ�ȭ 
		// �ֱ����ġ : ���� �������� ���α׷�[ ��ɾ����� ] ��� 
			// ����X ����X => �ֹ߼� �޸�
		// ���������ġ : [ C , USB , ���� , DB �� ]
			// ����X ����O => ���ֹ߼� �޸� 
	
	// ���� <------ ��Ʈ��(����:����Ʈ)-------> JAVA���α׷�

	public static void main(String[] args) throws Exception {
		// ����ó�� Ŭ���� 
			// 1. FileOutputStream : ������� ��Ʈ�� [ �ش� ������ ������ ���� ���� ] 
				// FileOutputStream ��ü�� = new FileOutputStream("���ϰ��/���ϸ�.Ȯ����");
					//   / : ��� 
				// 1. write( ����Ʈ�� ) : �ش� ���Ͽ� ���� 
		//FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
		FileOutputStream fileOutputStream = 
				new FileOutputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day12/test.txt");
			// ����� ���õ� Ŭ���� => ������ ����ó���߻�
		String ���ڿ� ="��Ŭ�������� �ۼ��� �����Դϴ�"; // �ѱ�14 * 2 => 28 + 2(sp) => 30
		fileOutputStream.write( ���ڿ�.getBytes() );
		
			// 2. FileInputStream : �����Է� ��Ʈ�� 
				// FileInputStream ��ü�� = new FileInputStream("���ϰ��/���ϸ�.Ȯ����");
				// 1. read( ����Ʈ�迭 ) : �ش� ������ ����Ʈ�迭�� �б� 
		//FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
		FileInputStream fileInputStream = 
				new FileInputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day12/test.txt");
			// �о�� ����Ʈ�� ������ �迭 
		byte[] ����Ʈ�迭 = new byte[1024]; // 1bit[0,1] -> 8bit[ 1byte ] -> 1024byte[ 1kb ]
		fileInputStream.read( ����Ʈ�迭 ); // ���� �о���� 
			//System.in.read(); // Ű���� �о���� 
			// ����Ʈ -> ���ڿ� ��ȯ 
		String strread = new String( ����Ʈ�迭 );
		System.out.println(" ���� ������ ������ : " + strread );
		
		///////////////////// 
		// Ű���忡 �Էµ� ������ �޸��� ���� ���� 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޸��� �Է��� ������ : ");
			String outstr = scanner.next();
			outstr = outstr +"\n";
			fileOutputStream.write( outstr.getBytes() );
		}
		
	}
}







