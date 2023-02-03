package lesson1_Design_1;

import java.util.List;

public class Corporate_Customer extends Customer {

	private List<Order> orders;
	private double totalPoint;
	private double totalprice;
	private double totalPriceBeforeDiscount;

	public Corporate_Customer(String nameString, String creditRatingString) {
		super(nameString, creditRatingString);

	}

	public void monthlyBill() {
		for (Order order : orders) {

			System.out.println(order.getPrice());

		}
	}

	@Override
	public void getStatusDate() {
		for (Order order : orders) {
			order.getStatuString();
		}
	}
	
	@Override
	public double getDiscountPrice() {

		double min = 0.0;
		for (Order order : orders) {

			totalprice += order.getPrice() - (order.getPrice() * min);
			totalPoint += order.getTotalPoint();

			if (totalPoint >= 25) {

				min = 0.4;
				totalPoint = 0.0;
			}

		}
		return totalprice;
	}
	@Override
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public double getPrice() {

		for (Order order : orders) {
			totalPriceBeforeDiscount += order.getPrice();

		}
		return totalPriceBeforeDiscount;

	}
	@Override
	public void getShippingDate() {
		for (Order order : orders) {

			order.getShippingDate();
		}

	}
}
