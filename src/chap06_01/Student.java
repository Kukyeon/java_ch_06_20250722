package chap06_01;

public class Student {  // 학생이라는 클래스를 선언

	
	// 속성 , 필드(field) , 멤버변수 -> 클래스 내에 선언된 변수		
	String name; // 학생의 이름
	String hakbun; // 학생의 학번
	int age; // 학생의 나이
	String phone; // 학생의 전화번호
	String address; // 학생의 주소
	
	
	// 클래스 내에 선언된 함수를 -> 메소드(method)
	
	public void outputName() {
		System.out.println(name);
	}
	
	
}
