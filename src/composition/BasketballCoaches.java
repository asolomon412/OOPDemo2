package composition;

// HAS-A Relationship also known as composition
public class BasketballCoaches {

	//instance variables
	private Person headCoach;
	private Person assistantCoach;
	
	public BasketballCoaches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballCoaches(Person headCoach, Person assistantCoach) {
		super();
		this.headCoach = headCoach;
		this.assistantCoach = assistantCoach;
	}

	public Person getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(Person headCoach) {
		this.headCoach = headCoach;
	}

	public Person getAssistantCoach() {
		return assistantCoach;
	}

	public void setAssistantCoach(Person assistantCoach) {
		this.assistantCoach = assistantCoach;
	}
	
	
}
