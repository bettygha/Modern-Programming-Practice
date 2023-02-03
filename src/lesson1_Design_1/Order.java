package lesson1_Design_1;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private LocalDate shippingDate;
	private LocalDate statuString;

	private List<Product> products;

	public LocalDate getStatuString() {
		return statuString;
	}

	public void setStatuString(LocalDate statuString) {
		this.statuString = statuString;
	}

	public LocalDate getShippingDate() {
		return shippingDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(List<Product> products) {
		this.products = products;

		statuString = LocalDate.now();
		System.out.println(" ");
		System.out.println(" ********* Order Made On date:  " + statuString);

		System.out.println(" ");
		setShippingDate(statuString);

	}

	public void setShippingDate(LocalDate statusString) {
		int totalDeliveryDate = 0;
		for (Product product : products) {
			// totalDeliveryDate += product.getDeliverDate();
			this.shippingDate = statusString.plusDays(product.getDeliverDate());
			System.out.println(
					" **** Shipping date for " + product.getClass().getSimpleName() + " will be on " + shippingDate);

		}

	}

	public double getTotalPoint() {
		double result = 0.0;
		for (Product product : products) {
			result += product.getPoint();

		}
		return result;
	}

	public double getPrice() {
		double price = 0.0;
		for (Product product : products) {
			price += product.getPrice();

		}
		return price;

	}

}
