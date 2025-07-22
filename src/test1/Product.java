package test1;

public class Product {
	String name;
	int price;
	int quantity;

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return price * quantity;
	}
}
