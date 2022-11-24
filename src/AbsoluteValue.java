import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a whole number:");
		int number = myObj.nextInt();
		System.out.println("|" + number + "| = " + absoluteValue(number));

	}

	public static int signum(int number) {

		if (number < 0) {
			return -1;
		} else if (number > 0) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int absoluteValue(int number) {

		return number * signum(number);

	}
}