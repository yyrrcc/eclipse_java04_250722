package construct;

public class Calculator {
	int a;
	int b;

	public Calculator() {
	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		System.out.println("두 수의 합은 " + (a + b));
	}

	public void sub() {
		System.out.println("두 수의 차는 " + (a - b));
	}

	public void multi() {
		System.out.println("두 수의 곱은 " + (a * b));
	}

	public void div() {
		System.out.println("두 수의 나눗셈은 " + (a / b));
	}

	public void squared() {
		System.out.println("첫번째 제곱수 : " + (a * a));
		System.out.println("두번째 제곱수 : " + (b * b));
	}

}
