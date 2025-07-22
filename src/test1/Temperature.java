package test1;

public class Temperature {
	double celsius;

	public Temperature(double celsius) {
		this.celsius = celsius;
	}

	public double toFahrenheit() {
		double fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;
	}
}
