package self;

class Updater {
	void update(Counter counter) {
		counter.count++;
	}
}

class Counter {
	int count = 0; // 객체변수
}

public class Sample01 {
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update:" + myCounter.count); // 0
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after update:" + myCounter.count); // 1
	}

}
