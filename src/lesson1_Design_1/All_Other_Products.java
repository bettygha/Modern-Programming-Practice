package lesson1_Design_1;

public class All_Other_Products extends Product {

	public All_Other_Products(String product_noString, String description, double price) {
		super(product_noString, description, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPoint() {
		// TODO Auto-generated method stub
		return 0.25;
	}
	@Override
	public int getDeliverDate() {
		return 1;
		
	}

	
}
