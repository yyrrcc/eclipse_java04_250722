package method1;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(); // null
		Rectangle rec2 = new Rectangle(20, 10, "blue");
		Rectangle rec3 = new Rectangle(10, 200); // 10, 200, null

		int area1 = rec2.rectArea();
		int area2 = rec2.rectArea(30, 50);
		int area3 = rec2.rectArea(40);

		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);

		System.out.println();

	}
}
