package class1;

public class AccountMain {
	public static void main(String[] args) {
		// 객체 선언(인스턴스 생성)
		Account acc1 = new Account();
		acc1.name = "신한";
		acc1.balance = 5000;
		acc1.amount = 1000;

		// 반환값만 있고 출력은 못하니까 여기서 sout해줘야 함
		int acc1Total = acc1.deposit();
		System.out.println(acc1Total);

		// 이미 메서드에 출력값이 있으니까 콘솔에 값이 찍힘
		acc1.outputName();
	}
}
