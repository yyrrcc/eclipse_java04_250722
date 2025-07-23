package method1;

public class Calculator2 {
	// 멤버변수 없이 메서드만 존재

	// 메서드 만들 때 선언하는 변수 : 매개변수 parameter
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	// 배열을 매개변수(파라미터)로 받을 수도 있다
	public int total(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}

}
