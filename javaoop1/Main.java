package javaoop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using constructor with 4 fields
		Pet mypet = new Pet("Joco", 2, "Ashville", "dog");

		// using constructor with 3 fields
		Pet mypet1 = new Pet("Loco", "Hilltop", "goat");

		System.out.printf("My pet is a %s and it is %d years old and it is from %s and the name is %s. \n",
				mypet.getType(), mypet.getAge(), mypet.getLocation(), mypet.getName());
		System.out.printf("My pet is a %s and it is from %s and the name is %s. \n", mypet1.getType(),
				mypet1.getLocation(), mypet1.getName());

		// Testing the string method for mypet
		System.out.println(mypet.getPetDetails());
		// Testing the boolean method for mypet
		System.out.println(mypet.isPetDog());
		// Testing the boolean method for mypet1
		System.out.println(mypet1.isPetDog());
	}
}