package ZeroToOne;

public class Customer {
	private String nameString;
	private ShoppingCart cart;
	public Customer(String nameString) {
		super();
		this.nameString = nameString;
	}
	public String getNameString() {
		return nameString;
	}
	
	public ShoppingCart getCart() {
		return cart;
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
	
	
	

}
