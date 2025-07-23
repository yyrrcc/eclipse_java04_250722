package test2;

public class AverageCalculator {
	public void getAverage(int[] arr) {
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		double avg = (double) sum / arr.length;
		System.out.println("평균: " + avg);
	}
}
