package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Day12_6_file {
	
	// �޸�[�ֱ����ġ=RAM] : ���� , �迭 , ��ü ��� : ���α׷� ����� �� �ʱ�ȭ 
		// �ֱ����ġ : ���� �������� ���α׷�[ ��ɾ����� ] ��� 
			// ����X ����X => �ֹ߼� �޸�
		// ���������ġ : [ C , USB , ���� , DB �� ]
			// ����X ����O => ���ֹ߼� �޸� 
	
	// ���� <------ ��Ʈ��(����:����Ʈ)-------> JAVA���α׷�

	public static void main(String[] args) throws Exception {
		// ����ó�� Ŭ���� 
			// 1. FileOutputStream : ������� ��Ʈ��
		FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
			// ����� ���õ� Ŭ���� => ������ ����ó���߻�
		String ���ڿ� ="��Ŭ�������� �ۼ��� �����Դϴ�";
		fileOutputStream.write( ���ڿ�.getBytes() );
	}
}







