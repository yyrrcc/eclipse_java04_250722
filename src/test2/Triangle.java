package test2;

public class Triangle {

	public boolean isValid(int a, int b, int c) {
		return (a + b) > c && (a + c) > b && (b + c) > a;
	}
}
