package chap06_01;

public class Triangle {
	
	
	// 삼각형을 추상화한 형상 -> 속성, 필드, 멤버변수
	
	int height; //높이
	int width; //넓이
	String color; //색갈
	
	// 메소드
	// 삼각형 면적
	
	// 작성시 public 은 고정값. 그다음은 메소드가 반환해주는 값에 대한 타입 double,int,등등
	// void 는 반환하지않는 값
	public double triangleArea() {
		double area = height * width * 0.5; //어떤걸 메소드할건지(삼각형 면적구하기)
		return area;  // 메소드에 입력된 값을 반환하는, 값 한개만 가능
		
		// 다른방식으로는  (  return height * width * 0.5;  ) 도 가능
	}
	
	public String triangleColor() {
		System.out.println("삼각형의 색은 : " + color);
		return color;  // 색의 값 반환 
	}
	
	
	
	
}
