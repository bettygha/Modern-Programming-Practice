package lesson1_Design_1;

public class Health_Related_Products extends Product {

	
	public Health_Related_Products(String product_noString, String description, double price) {
		super(product_noString, description, price);
		
	}

	@Override
	public double getPoint() {
		
		return 1;
	}
	public int getDeliverDate() {
		return 10;
		
	}
	

}
