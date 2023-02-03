package lesson1_Design_1;

import java.util.List;

public class Customer {

	private String nameString;
	private String creditRatingString;

	private String pointString;
	private List<Order> orders;

	private double totalPoint;
	private double totalprice;
	private double totalPriceBeforeDiscount;

	public Customer(String nameString, String creditRatingString) {

		this.nameString = nameString;
		this.creditRatingString = creditRatingString;
	}

	public String getPointString() {
		return pointString;
	}

	public void setPointString() {

		for (Order order : orders) {
			this.pointString += order.getTotalPoint();
		}
	}

	public String getCreditRatingString() {
		return creditRatingString;
	}

	public void setCreditRatingString(String creditRatingString) {
		this.creditRatingString = creditRatingString;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public double getPrice() {

		return 0.0;

	}

	public double getDiscountPrice() {

		return 0.0;
	}

	public void getStatusDate() {

	}

	public void getShippingDate() {

	}

}
