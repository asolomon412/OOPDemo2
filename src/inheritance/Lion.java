package inheritance;

public class Lion extends Animal {

	private String mane;

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Lion(String name, String gender, int age) {
//		// this is a reference to the parent class overloaded constructor in Animal
//		super(name, gender, age);
//		// TODO Auto-generated constructor stub
//	}


	public Lion(String name, String gender, int age, String mane) {
		super(name, gender, age);
		this.mane = mane;
	}

	public String getMane() {
		return mane;
	}

	public void setMane(String mane) {
		this.mane = mane;
	}

	@Override
	public String toString() {
		// you can use the super keyword to reference
		// any public/protected methods from the parent class
		return super.toString() + " " + mane;
 	}

}
