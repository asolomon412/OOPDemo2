package composition;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		
		Person rusty = new Person("Rusty", "Sinis", 17, "555 Main St.");
		rusty.setAge(34);
		System.out.println(rusty);
		
		Person[] people = new Person[3];
		people[0] = new Person("Kris", "Cherven", 20, "111 Main St.");
		people[0].setAddress("1570 Woodward Ave.");
		people[1] = new Person("Kiara", "Atkins", 21, "777 Town Blvd.");
		people[2] = new Person("Atiba", "Franklin", 27, "333 Main St.");
		
		System.out.println(Arrays.toString(people));
		
		for(Person pTemp : people) {
			System.out.println(pTemp.getFirstName() + " " + pTemp.getLastName());
		}
		
		ArrayList<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person("Kevin", "Busch", 24, "444 Broderick Tower"));
		System.out.println(peopleList);

	}

}
