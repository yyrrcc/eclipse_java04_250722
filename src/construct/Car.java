package construct;

public class Car {
	String name;
	int maxSpeed;
	// 다른 클래스를 멤버변수로 불러오기
	Engine engine;

	public Car() {
	}

	// 매개변수로 클래스 이름을 사용해서 받는다
	public Car(String name, int maxSpeed, Engine engine) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}

	public void carType() {
		System.out.println("자동차 종류: " + name);
		// 불러온 클래스의 멤버변수를 가져와서 사용 가능
		System.out.println("엔진 타입: " + engine.type);
		// 불러온 클래스의 메서드를 가져와서 사용 가능
		engine.printEngine();
	}

}
