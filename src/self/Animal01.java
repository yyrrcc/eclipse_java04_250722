package self;

public class Animal01 {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.SetName("Nabi");
//		cat.age = 10;
//
		Animal dog = new Animal();
		dog.SetName("Bori");
//		dog.age = 5;

		System.out.println(cat.name);
		System.out.println(dog.name);
//		System.out.println(dog.age);
	}

}
