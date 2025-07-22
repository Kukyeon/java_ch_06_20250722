package chap06_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가로10 세로20 -> 면적출력
		
		Rectangle rec1 = new Rectangle();
		rec1.width = 10;  // 가로 길이
		rec1.height = 20;  // 세로길이
		int rec1Area = rec1.rectArea();  // 메소드값
		
	
		System.out.println(rec1Area); 
		
		Rectangle rec2 = new Rectangle(100, 200);
		int rec2Area = rec2.rectArea();
		System.out.println(rec2Area); 
	}

}
