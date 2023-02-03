package lesson1_Design_1;

import java.time.LocalDate;

public class Audio_Video_Related_Products extends Product {

	private LocalDate shippingDate ;
	private int deliveryDate  = 5;
	
	public Audio_Video_Related_Products(String product_noString, String description, double price) {
		super(product_noString, description, price);
		
	}

	@Override
	public double getPoint() {
		
		return 0.5;
	}
	public LocalDate setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
		return shippingDate;
	}
	
	@Override
	public int getDeliverDate() {
		
		return this.deliveryDate;
	}
	

}
