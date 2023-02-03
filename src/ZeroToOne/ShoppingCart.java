package ZeroToOne;

public class ShoppingCart {

	private ShoppingCart(Customer customer ) {
		customer.setCart(this);
	}
	public static ShoppingCart newShoppingCart(Customer customer) {
		if(customer == null) {
			throw new NullPointerException("null cust");
		}
		return new ShoppingCart(customer);
	}
}
