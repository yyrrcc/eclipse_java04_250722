package construct;

public class Circle {
	int radius; // 반지름
	double Pi = 3.14;

	// 기본 생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
		// Pi = pi; 이미 값이 정해져 있으니까 쓸 필요 없음
	}

	// 입력된 반지름을 가진 원의 면적을 반환하는 메서드
	public double circleArea() {
		return radius * radius * Pi;
	}

}
