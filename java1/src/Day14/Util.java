package Day14;

public class Util {

	public static <T> Box<T> boxing(T t){
				// <���׸�>  ��ȯŸ��  �޼ҵ��(�μ�)
		Box<T>box = new Box<>();
		box.setT(t);
		return box;
	}
	
}
