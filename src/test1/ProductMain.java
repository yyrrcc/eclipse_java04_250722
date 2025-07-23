package test1;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product("키보드", 100000, 2);
		int p1TotalPrice = p1.getTotalPrice();
		System.out.println("총 가격: " + p1TotalPrice);
	}
}
