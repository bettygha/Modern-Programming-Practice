package lesson1_Design_1;

import java.time.LocalDate;

public class Computer_Related_Products  extends Product{

	private LocalDate shippingDate ;
	private int deliveryDate  = 3;
	public Computer_Related_Products(String product_noString, String description, double price) {
		super(product_noString, description, price);
		
	}

	@Override
	public double getPoint() {
		// TODO Auto-generated method stub
		return 2.0;
	}
	
	public LocalDate setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
		return shippingDate;
	}
	
	@Override
	public int getDeliverDate() {
		
		return deliveryDate;
	}

}
