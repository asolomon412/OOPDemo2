package composition;

public class CoachesApp {

	public static void main(String[] args) {
		Person sean = new Person("Sean", "Yang", 27, "112 West Palm Ave.");
		BasketballCoaches coaches = new BasketballCoaches(sean, new Person("Tasha", "Langston", 32, "777 Java Blvd."));
		System.out.println(coaches); // this prints the memory location because we didn't add an overridden toString()
		
		System.out.println(coaches.getHeadCoach());
		System.out.println(coaches.getAssistantCoach());
		
		

	}

}
