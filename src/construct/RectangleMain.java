package construct;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.width = 10;
		rec1.height = 20;
		System.out.println(rec1.area());

		// 객체(인스턴트) 만듬과 동시에 생성자를 통해서 매개변수 채워서
		Rectangle rec2 = new Rectangle(30, 40);

	}

}
