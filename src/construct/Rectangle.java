// construct 생성자
package construct;

public class Rectangle {
	int width;
	int height;

	// 기본 생성자 : 클래스 이름과 동일
	public Rectangle() {

	}

	// 생성자 안에 들어간 값 : 매개변수, parameter
	// 생성자 만드는 단축키 Alt + Shift + S, O
	public Rectangle(int width, int height) {
		// 초기화. this는 이 클래스의 변수(멤버변수) 의미
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}

}
