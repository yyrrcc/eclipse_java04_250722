package test2;

public class Rectangle {
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void circumference() {
		double circumference = 2 * (width + height);
		System.out.println("사각형 둘레 길이는 " + circumference);
	}

}
