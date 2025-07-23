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
	// 멤버 변수들을 { } 배열 안에 넣어서 그 길이를 변수로 잡아서 하는 방법
	public void printScore() {
		int sum = kor + eng + math;
		double average = (double) sum / 3; // 오른쪽에도 (double) 해줘야 함

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
