package lesson1_Design_1;

import java.util.List;

public class Payment {

	private boolean isPrePaid;

	List<Customer> customers;
	double creditLimit = 100.00;

	public Payment(boolean isPrePaid, List<Customer> customers) {

		this.isPrePaid = isPrePaid;
		this.customers = customers;
	}

	public void getPrice() {
		double price = 0.0;
		for (Customer customer : customers) {
			price = customer.getDiscountPrice();
			if (price > creditLimit && customer instanceof Corporate_Customer) {

				isPrePaid = true;

				System.out.println(" ");
				System.out.println("Monthly Bill for " + customer.getClass().getSimpleName());

				Corporate_Customer corporate_Customer = (Corporate_Customer) customer;

				corporate_Customer.monthlyBill();

			}

		}

	}

	public void getStatusDate() {
		for (Customer customer : customers) {

			customer.getStatusDate();

			customer.getShippingDate();
		}
	}

}
