package construct;

public class Engine {
	String type; // 엔진 종류
	int displacement; // 배기량

	public Engine() {
	}

	public Engine(String type, int displacement) {
		this.type = type;
		this.displacement = displacement;
	}

	public void printEngine() {
		System.out.println("엔진의 배기량: " + displacement);
	}
}
