package lesson1_Design_1;

import java.time.LocalDate;

public class Product {
	private String product_noString;
	private String description;
	private double price ;
	private   LocalDate shippingDate ;
	private int diliveryDate ;
	
	public Product(String product_noString, String description, double price) {
		
		this.product_noString = product_noString;
		this.description = description;
		this.price = price;
	}
	public double getPoint() {
		return 0.0;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDate setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
		return shippingDate;
	}
	public int getDeliverDate() {
		return diliveryDate;
		
	}
	
}
