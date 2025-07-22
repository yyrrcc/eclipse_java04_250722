package class1;

public class StudentMain {

	public static void main(String[] args) {
		// 클래스를 이용해서 객체(인스턴스) 생성
		Student student1 = new Student();
		// 객체값 대입
		student1.name = "Amy";
		student1.age = 19;
		student1.address = "Korea";
		student1.grade = 95;
		student1.subject[3] = "사회";

		Student student2 = new Student();
		student2.name = "Emma";
		student2.age = 17;
		student2.address = "Canada";
		student2.grade = 90;

		student1.sayHello();
		student2.outputName();

	}

}
