package lesson1_Design_1;

import java.util.ArrayList;
import java.util.List;



public class Application {

	public static void main(String[] args) {
		Product productOne = new All_Other_Products("12A", "Book", 100.0); //1
		Product productTwo = new Audio_Video_Related_Products("13B", "Charger", 50.0); // 10
		Product productThree = new Health_Related_Products("14A", "Pills", 20);
		
		Product productFour = new All_Other_Products("15C", "Book", 100.0);
		Product productFive = new Audio_Video_Related_Products("13B", "Charger", 50.0);
		Product productSix =new Health_Related_Products("14A", "Pills", 20);
		
		List<Product> productListOne = new ArrayList<>();
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		productListOne.add(productOne);
		productListOne.add(productTwo);
		productListOne.add(productThree);
		
		
		List<Product> productListTwo= new ArrayList<>();
		productListTwo.add(productFour);
		productListTwo.add(productFive);
		productListTwo.add(productSix);
		
		
		Order orderOne = new Order();
		orderOne.addProducts(productListOne);
		
		Order orderTwo = new Order();
		orderTwo.addProducts(productListTwo);
		
		
		List<Order> orders = new ArrayList<>();
		orders.add(orderOne);
		orders.add(orderTwo);
		
		
		Customer customer = new Personal_Customer("Abebe", null);
		Customer customer2 = new Corporate_Customer("Bekila", "Excellent");
		
		List<Customer> customers = new ArrayList<>();
		customers.add(customer);
		customers.add(customer2);
		
		
		
		
		customer.setOrders(orders);
		customer2.setOrders(orders);
		
		System.out.println("");
		System.out.println(" **** Total Price before discount for " + customer.getClass().getSimpleName() + " was "+ customer.getPrice() );
		System.out.println(" **** Total Price after discount for " + customer.getClass().getSimpleName() + " is "+ customer.getDiscountPrice());
		
		System.out.println("");
		System.out.println(" **** Total Price before discount for " + customer2.getClass().getSimpleName() + " was "+ customer2.getPrice() );
		System.out.println(" **** Total Price after discount for " + customer2.getClass().getSimpleName() + " is "+ customer2.getDiscountPrice());
		
		Payment payment = new Payment(false, customers);
		
		payment.getPrice();
		payment.getStatusDate();
		
	}
}
