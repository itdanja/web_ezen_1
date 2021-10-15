package Day12;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {
	
	//1.�ʵ� [ �޸� = ���� ]
	private String id;
	private String password;
	private String name;
	private String phone;
		// private : ���������� : �ʵ带 ��ȣ�� ��ȣ�ϱ� ���� [ �ٸ� Ŭ�������� ���� �Ұ� ]
	
	//2.������
		// �������
	public Member() {}
		// ��� �ʵ带 �޴� ������ 
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	//3.�޼ҵ� 
		// 1. private �ʵ� ���� get , set [ �ܺ� Ŭ������ ���� ]
		// 2. �α��� �޼ҵ� 
	public void login() {
		
	}
		// 3. ȸ������ �޼ҵ� 
	public void signup() {
		//0.�Է°�ü �������� 
		Scanner scanner = Day12_7_Memberfile.scanner;
	
		// 1. �Է�
		System.out.println(" *** ȸ������ ������ *** ");
		System.out.println(" ���̵� : ");		String id = scanner.next();
		System.out.println(" ��й�ȣ : ");	String password = scanner.next();
		System.out.println(" �̸� : ");		String name = scanner.next();
		System.out.println(" ����ó : ");		String phone = scanner.next();
		// 2. ��ü ���� 
		Member member = new Member(id, password, name, phone);
			
			//* �迭�� ���� 
			for( int i = 0 ; i<Day12_7_Memberfile.members.length ; i++ ) {
				if( Day12_7_Memberfile.members[i] == null) {
					Day12_7_Memberfile.members[i] = member; break;
				}
			}
		// 3. ���� ���� 
			// 1. ȸ����[\n] �ʵ庰[ , ] ���� ����
			// * �迭�� ��� ��ü�� ���� ó�� 
		try {

			//1. ������� ��ü
				FileOutputStream fileOutputStream = 
						new FileOutputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day12/memberlist.txt" , true ); // true �̾��
				// 2. ��ü �������� [ �ʵ� ����  ( \n: ȸ������  , : �ʵ屸�� ]
					String outstring = member.id+","+member.password+","+member.name+","+member.phone+"\n";
					fileOutputStream.write( outstring.getBytes() ); // ����Ʈ�� ��ȯ�� ���� 
			
		}
		catch (Exception e) {
			System.out.println(" [�˸�] : ȸ�� DB ���� ���� : " + e);
		}
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
