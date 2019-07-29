package inheritance;

public class AnimalApp {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAge(155);
		animal.setGender("male");
		System.out.println(animal);

		Lion lion = new Lion();
		lion.setName("Scary");
		lion.setAge(5);
		lion.setGender("male");
		System.out.println(lion);

		Lion lion2 = new Lion("Mean", "female", 17, "no");
		System.out.println(lion2);

		// by assigning a child to the parent class we don't have access to the methods
		// that are specific to the Lion
		// it's like the parent doesn't know it has a child
		Animal lion3 = new Lion();
		// lion3
	}

}
