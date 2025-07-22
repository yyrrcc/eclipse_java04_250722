// class 클래스
package class1;

public class Student {
	// 클래스에는 멤버변수(필드), 생성자, 메서드 이렇게 들어간다

	// 클래스에 소속된 변수 : 멤버변수, 필드, 속성
	String name;
	int age;
	String address;
	String[] subject = { "국어", "영어", "수학", "과학" };
	int grade;

	// 클래스 내에 선언된 함수 : 메서드(method)
	public void sayHello() {
		System.out.println("Hello");
	}

	public void outputName() {
		System.out.println(name);
	}
}
