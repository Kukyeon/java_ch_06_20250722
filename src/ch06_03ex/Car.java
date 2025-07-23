package ch06_03ex;

public class Car {
	
	String name;
	
	int maxspeed;
	
	Engine engine; //엔진 클래스로 만든 객체를 선언


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(String name, int maxspeed, Engine engine) {
		super();
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	
	public void carEngineType() {
		System.out.println("엔진타입 :" + engine.type);
		engine.printEngine();
	}
	
	
}
