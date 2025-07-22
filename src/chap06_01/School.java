package chap06_01;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "kor";
//		String b = "kor";
//		String str = new String("kor");
//		
		
		
		Student stu1 = new Student(); // 메모리에 stu1이라는 객체가 생성됨
		stu1.name ="홍길동";
		stu1.hakbun = "20250722";
		stu1.age = 22;
		stu1.phone = "010-1212-3131";
		stu1.address = "서울시 마포구";
		stu1.outputName();
		
		Student stu2 = new Student();
		stu2.name = "김유신";
		stu2.hakbun = "20250721";
		stu2.age = 21;
		stu2.phone = "010-5511-5151";
		stu2.address = "서울시 강남구";
		stu2.outputName();
		
		
		
		
	}

}
