package Day09;

public interface ATM {
	// 1. ��� �ʵ�
	// 2. �߻� �޼ҵ� [ ���� �ϰ� �����ڵ� ����x ]
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	// 3. ����Ʈ �޼ҵ� 
	default void ����() {System.out.println(" ATM ���� �մϴ� ");}
	// 4. ���� �޼ҵ� 
	
}
