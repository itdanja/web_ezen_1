package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day15_6 {
	
	// �÷��� �����ӿ�ũ ��ø ( ������ �÷��� �� �ϳ��� �÷��� ���� )
	public static void main(String[] args) {
		// ��ø  map< Ű , arraylist >
		HashMap< String , ArrayList<String> > ������� = new HashMap<>();
			ArrayList<String> �Ƿ���� = new ArrayList<>();
			ArrayList<String> �Ź߸�� = new ArrayList<>();
		�������.put( "�Ƿ�", �Ƿ���� );
		�������.put( "�Ź�", �Ź߸��);
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			
			System.out.println("------------ ��ǰ ��Ȳ --------------");
			for( int i = 0 ; i<�Ƿ����.size(); i++ ) {
				System.out.println( �������.get("�Ƿ�").get(i) );
			}
			
			System.out.println(" ��ǰ��� : 1.�Ƿ� 2.�Ź�");		int ch = scanner.nextInt();
			if( ch== 1 ) {
				System.out.println(" ��ǰ�� : ");	String ��ǰ�� = scanner.next();
				�Ƿ����.add(��ǰ��);
			}
		}
	}
}
