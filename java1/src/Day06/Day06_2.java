package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		//p.221
		Car3 car1 = new Car3();
		System.out.println("car1.comany : " + car1.company);
		System.out.println("car1.model : " + car1.model );
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���");
		System.out.println("car2.comany : " + car2.company);
		System.out.println("car2.model : " + car2.model );
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car3 car3 = new Car3("�ڰ���", "����");
		System.out.println("car3.comany : " + car3.company);
		System.out.println("car3.model : " + car3.model );
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		
		Car3 car4 = new Car3("�ý�", "����", 200);
		System.out.println("car3.comany : " + car4.company);
		System.out.println("car3.model : " + car4.model );
		System.out.println("car3.color : " + car4.color);
		System.out.println("car3.maxSpeed : " + car4.maxSpeed);
		
	}

}
