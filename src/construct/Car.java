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

	// engine이라는 변수는 Engine 클래스 타입의 객체. 반환형은 당연히 Engine 타입.
	public Engine outputEngine() {
		return engine;
	}

	// 반환값이 cars, 즉 String[] 이기 때문에 반환형도 마찬가지로 String[] 적어주면 된다.
	public String[] outputCars() {
		String[] cars = { "현대", "기아", "테슬라" };
		return cars;
	}
}
