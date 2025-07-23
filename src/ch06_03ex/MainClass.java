package ch06_03ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(10); 
			
			System.out.println(circle.circleArea());
		
			
			System.out.println("================================");
		
			
			
			FourClass fourClass = new FourClass(20, 10);
					
			fourClass.add();
			fourClass.add1();
			fourClass.add2();
			fourClass.add3();
					
			System.out.println("================================");
			
			Engine engine = new Engine("가솔린", 2);
			
			
			Car car = new Car("막시무스", 200, engine);
			
			car.carEngineType();
			
			
	}

}
