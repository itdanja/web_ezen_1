package Day14;

public class Day14_1 {

	public static void main(String[] args) {
		
		// ���׸� : Ÿ�Ժ�ȯ ����
		Member<String , Integer> member = new Member<>();
		
		// p.660  :���׸� �޼ҵ� 
		Box<Integer> box1 = Util.<Integer>boxing( 100 );
		System.out.println( box1.getT() );
		
		Box<String> box2 = Util.boxing("ȫ�浿");
		System.out.println(  box2.getT() );
		
		
		
		
	}
}
