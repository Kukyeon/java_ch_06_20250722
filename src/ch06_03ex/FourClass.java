package ch06_03ex;

public class FourClass {

	
	int num1;
	int num2;
	
	public FourClass(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	
	public FourClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void add() { // 덧셈
		System.out.println(num1+num2);}
	public void add1() { // 뺼셈
		System.out.println(num1-num2);}
	public void add2() { // 곱셈
		System.out.println(num1*num2);}
	public void add3() { // 나눗셈
		System.out.println(num1/num2);
				
	}
	
	
}
