package lesson1_Lab5_1;

import java.time.LocalDate;

public class Order {
	private String orderNoString;
	private LocalDate orderDateString;
	private double orderAmount;
	public Order(String orderNoString, LocalDate orderDateString, double orderAmount) {
		super();
		this.orderNoString = orderNoString;
		this.orderDateString = orderDateString;
		this.orderAmount = orderAmount;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
	
	

}
