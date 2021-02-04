package javaoop1;

public class Pet {
	// name (PRIVATE) age (PRIVATE) location (PRIVATE) type (PRIVATE)
	private String name;
	private int age;
	private String location;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// create a method which returns string
	public String getPetDetails() {
		String petdetails;
		petdetails = "PetName=" + this.name + " Type=" + this.type + " Location=" + this.location;
		return petdetails;
	}
	
	// create a method to return a boolean
	public boolean isPetDog() {
		return this.type == "dog";				
		}
		
	public Pet() {
	}

	// Creating a constructor with 3 fields
	public Pet(String name, String location, String type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}

	public Pet(String name, int age, String location, String type) {
		// Is it necessary to have it. If yes, what is means and why it is needed for?
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
}
