package chap06_03;

public class Rectangle { // 사각형 클래스

	int width; // 사각형 가로
	int height; // 사각형 세로
	
//	public Rectangle() { // 생성자, 반환타입이 없고, 이름이 해당 클래스의 이름으로 고정됨
//		// 아무런 코드도 넣지않고 선언만 된 기본 생성자. / 생략 가능
//	}
//	
//	public Rectangle(int width, int height) {// 매개 변수/parameter/
//		this.width = width; 
//		this.height = height;  // 전형적인 생성자로 필드값을 초기화하는 방법. " this. "
//	}
	
	
	public Rectangle() {}
	
	
	
	
	public Rectangle(int width, int height) {
	
	this.width = width;
	this.height = height;
}




	public int rectArea() { // 사각형 면적을 반환하는 메소드.
		return width * height;
	
		
		
	}

	
	
	
}
