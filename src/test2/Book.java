package test2;

public class Book {
	String name;
	int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("책의 이름은 " + name + ", 가격은 " + price + "입니다.");
	}

}
