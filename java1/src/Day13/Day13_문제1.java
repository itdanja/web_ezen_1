package Day13;

public class Day13_문제1  {
	
	public static void main(String[] args) {
		
		강아지소리 강아지소리 = new 강아지소리();
		고양이소리 고양이소리 = new 고양이소리();
		호랑이소리 호랑이소리 = new 호랑이소리();
		
		강아지소리.start();
		고양이소리.start();
		호랑이소리.start();
		
		try {
			Thread.sleep(6000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println( "스레드1 이름 : "+ 강아지소리.getName() ) ;
		System.out.println( "스레드2 이름 : "+ 고양이소리.getName() ) ;
		System.out.println( "스레드3 이름 : "+ 호랑이소리.getName() ) ;
		
		
		
		
		
		
	}

}
