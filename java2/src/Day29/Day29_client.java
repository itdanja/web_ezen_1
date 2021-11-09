package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {
	
	// ��ſ� Ŭ���̾�Ʈ ����� 
	
	public static void main(String[] args) {
		
		// 1. ���� ����� 
		Socket socket = new Socket();
		try {
			while( true ) {
				socket.connect( new InetSocketAddress("127.168.102.50", 5000));
				System.out.println(" [[ ������ ���� ���� ]] ");
				
				// 3. ������ �۽��ϱ� [ ������ ] : ��Ʈ���̿��� �ܺ� ��Ʈ��ũ ��� 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" �������� ���� �޽��� : ");
				String msg = scanner.nextLine();
				OutputStream outputStream = socket.getOutputStream(); // ���� ��� ��Ʈ�� 
				outputStream.write( msg.getBytes() ); // �Է¹��� ���ڿ� -> ����Ʈ�� ������ ��� 
				System.out.println(" �������� �޽��� ���� ����");
				// 4. ������ �����ϱ� [ �ޱ� ] 
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new  byte[1000];
				inputStream.read( bytes );
				System.out.println(" ������ �޽��� : " + new String(bytes) );
				
				
				
				
				
				
			}
		}
		catch (Exception e) {}
		
		
	}

}
