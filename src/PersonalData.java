import java.util.Scanner;

public class PersonalData {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Full Name:");

		String fullname = myObj.nextLine();

		System.out.println("Enter Birthyear:");
		int birthyear = myObj.nextInt();
		int age = 2021 - birthyear;

		System.out.println("Are you living in a city? (true/false):");
		boolean city = myObj.nextBoolean();
		String city_type;
		if (city == true) {
			city_type = "City";
		} else {
			city_type = "Not city";
		}

		System.out.println("Full name: " + fullname);
		System.out.println("Birthyear: " + birthyear + "(" + age + " year old)");
		System.out.println("Type of residence: " + city_type );
	}
}
