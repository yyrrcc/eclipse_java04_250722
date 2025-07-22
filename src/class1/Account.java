// class 클래스
package class1;

public class Account {
	String name;
	int balance;
	int amount;

	// return 반환값
	public int deposit() {
		int total = balance + amount;
		return total;
	}

	// 반환값 없고 출력만
	public void outputName() {
		System.out.println(name + "은행 계좌");
	}

}
