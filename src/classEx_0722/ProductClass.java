package classEx_0722;

public class ProductClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product pri = new Product();
		pri.name = "megacoffee";
		pri.price = 2000;
		pri.quantity = 100;
		
		int priprice = pri.getTotalPrice();
		
		System.out.println("총 가격 : " + priprice);
		
	}

}
