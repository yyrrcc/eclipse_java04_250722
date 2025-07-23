package test2;

public class BmiCalculator {
	public void bmiCalulator(double height, double weight) {
		double bmi = weight / (height * height);
		System.out.println("bmi : " + bmi);
	}
}
