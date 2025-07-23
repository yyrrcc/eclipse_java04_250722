package test2;

public class Main {

	public static void main(String[] args) {
		// 1번 문제 : Book
		Book book1 = new Book("소년이 온다", 15000);
		book1.printInfo();

		System.out.println("---------------------------------");

		// 2번 문제 : 문자열 길이 값 출력
		StringTool st1 = new StringTool();
		st1.printLength("Korea");

		System.out.println("---------------------------------");

		// 3번 문제 : 정수형 배열의 평균값
		AverageCalculator ac1 = new AverageCalculator();
		ac1.getAverage(new int[] { 10, 20, 30, 40, 50 });

		System.out.println("---------------------------------");

		// 4번 문제 : bmi
		BmiCalculator bc1 = new BmiCalculator();
		bc1.bmiCalulator(1.65, 55);

		System.out.println("---------------------------------");

		// 5번 문제 : 사각형 둘레
		Rectangle rec1 = new Rectangle(10.5, 40);
		rec1.circumference();

		System.out.println("---------------------------------");

		// 6번 문제 : 삼각형 판별
		Triangle tr1 = new Triangle();
		boolean r1 = tr1.isValid(3, 4, 5);
		System.out.println(r1);
		boolean r2 = tr1.isValid(5, 9, 12);
		System.out.println(r2);
		boolean r3 = tr1.isValid(1, 2, 3);
		System.out.println(r3);

	}

}
