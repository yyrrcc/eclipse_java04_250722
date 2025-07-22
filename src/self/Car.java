package self;

public class Car { // 클래스 이름
	private String modelName; // 필드
	private int modelYear; // 필드

	Car(String modelName, int modelYear) { // 생성자
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	public String getModel() { // 메소드
//		return this.modelYear + "년식 " + this.modelName + " " + this.color;
		return this.modelYear + "년식 " + this.modelName;
	}

}
