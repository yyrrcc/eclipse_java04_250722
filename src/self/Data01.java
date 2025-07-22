package self;

public class Data01 {

	public static void main(String[] args) {

		// 자바는 항상 변수의 값을 복사해서 대입한다.
		// 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고,
		// 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;

		System.out.println("dataA 참조값=" + dataA);
		System.out.println("dataB 참조값=" + dataB);
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);
		// dataA 변경
		dataA.value = 20;
		System.out.println("변경 dataA.value = 20");
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);
		// dataB 변경
		dataB.value = 30;
		System.out.println("변경 dataB.value = 30");
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);
	}

}
