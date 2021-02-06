package javaoop1;

public class CustomPet {

	private String name;
	private String breed;
	private String type;

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomPet(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public CustomPet(String name, String breed, String type) {
		super();
		this.name = name;
		this.breed = breed;
		this.type = type;
	}

	@Override
	public String toString() {
		return "CustomPet [name=" + name + ", breed=" + breed + ", type=" + type + "]";
	}

	public boolean isPetDog() {
		return "dog".equalsIgnoreCase(type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using constructor with 4 fields
		CustomPet mypet1 = new CustomPet("Toto", "Poodle", "DOG");
		System.out.println(mypet1.toString());
		System.out.println(mypet1.isPetDog());

		// using constructor with 3 fields
		CustomPet mypet2 = new CustomPet("Bruno", "goat");
		System.out.println(mypet2.toString());
		System.out.println(mypet2.isPetDog());
	}

}
