package classEx_0722;

public class Product {

	
	String name; //(상품명)

	int price; //(가격)

	int quantity; //(수량)
	
	public int getTotalPrice() { 
		return price * quantity;
	}
	
	
}
