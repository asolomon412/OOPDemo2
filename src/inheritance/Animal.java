package inheritance;

// this is considered a concrete class
// Generic superclass
public class Animal {

	// instance variables
	private String name;
	private String gender;
	private int age;

	public Animal() {
		super();
		name = "My name is Animal...";
	}

	public Animal(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String myFormat = "Name: %-30s Age: %-10s Gender: %-10s";
		return String.format(myFormat, name, age, gender);
	}

	
}
