package Day13;

public class Movie extends Thread {
	
	static boolean stop = true;
	
	public static void moviestop( boolean sw ) {
		
		stop = sw;
		if( stop ) {System.out.println("---��ȭ ����");} 
		else { System.out.println("---��ȭ ����");}
		
	}
	
	@Override
	public void run() {
		while(stop) { // stop �� true�� ��쿡�� ���� // �ƴϸ� ���� x
			System.out.println(" ��ȭ������~~~ ");
			try { Thread.sleep(1000); }
			catch (Exception e) {}
		}	
	}

}
