package method1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator2 calculator2 = new Calculator2();
		// add 메서드에 넣는 값 : 인수(arguments)
		int add = calculator2.add(20, 10);
		System.out.println(add);
		int sub = calculator2.sub(20, 10);
		System.out.println(sub);
		int mul = calculator2.mul(20, 10);
		System.out.println(mul);
		int div = calculator2.div(20, 10);
		System.out.println(div);

		int sum1 = calculator2.total(new int[] { 10, 20, 30, 40, 50 });
		System.out.println(sum1);

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int sum2 = calculator2.total(arr1);
		System.out.println(sum2);
	}

}
