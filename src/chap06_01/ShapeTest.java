package chap06_01;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Triangle tri1 = new Triangle();  // 객체 선언, 인스턴스 생성 변수3개,메소드2개
		tri1.height = 20;
		tri1.width = 10;
		tri1.color = "red";
		
		double tri1area = tri1.triangleArea();  // 반환 받아주기
		System.out.println(tri1area);  // 반환 받은값 표시시시시시시
	 // System.out.println(tri1.height * tri1.width * 0.5); 	이런 방식도 뭐.. 가능하긴하지만 메소드만드는게 더 편한느낌
		String tri1colir = tri1.triangleColor(); // 메소드 call _ 메소드 호출
		// 메소드 클래스에 이미 아웃프린트를 찍어놔서 자동출력 
	}

}
