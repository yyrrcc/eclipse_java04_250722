package test1;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1 = new Movie("해리포터", "판타지", 170);

		boolean m1Time = m1.isLongMovie();
		System.out.println(m1Time);
	}

}
