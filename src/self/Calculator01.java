package self;

public class Calculator01 {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		cal1.a = 10;
		cal1.b = 3;

		cal1.add();
		cal1.subtraction();
		System.out.println(cal1.multiplication());
		System.out.println(cal1.division());
	}

}
