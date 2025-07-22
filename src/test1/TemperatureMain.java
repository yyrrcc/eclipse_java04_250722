package test1;

public class TemperatureMain {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(25);

		double temp2 = temp1.toFahrenheit();
		System.out.println(temp2);
	}

}
