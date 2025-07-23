package construct;

public class CarMain {

	public static void main(String[] args) {
		Engine engine1 = new Engine("가솔린", 2);
		Car car1 = new Car("현대", 200, engine1);

		car1.carType();
	}

}
