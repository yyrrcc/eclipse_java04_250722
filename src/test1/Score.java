package test1;

public class Score {
	int kor;
	int eng;
	int math;

	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 평균값 나눌 때 변수의 총합(3)을 따로 지정하는 방법이 있는지?
	public void printScore() {
		int sum = kor + eng + math;
		double average = sum / 3;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);

		if (average >= 90) {
			System.out.println("우수");
		} else if (average < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
	}
}
