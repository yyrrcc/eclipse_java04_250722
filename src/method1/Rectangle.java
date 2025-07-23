package method1;

public class Rectangle {
	int width;
	int height;
	String color;

	// 생성자 오버로딩
	public Rectangle() {
	}

	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 메서드 오버로딩
	// 메서드의 이름이 같아도 '매개변수'의 타입 및 순서가 다르면 오버로딩 가능
	public int rectArea() {
		return width * height;
	}

	public int rectArea(int width, int height) {
		return width * height;
	}

	public int rectArea(int width) {
		return width * this.height;
	}
}
