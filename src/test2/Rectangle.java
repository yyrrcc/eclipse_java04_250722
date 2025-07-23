package test2;

public class Rectangle {
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 생성자 오버로딩 하라고?
	public void circumference() {
		double circumference = 2 * (width + height);
		System.out.println("사각형 둘레 길이는 " + circumference);
	}

}
