import java.util.*;

public class ShoppintListAnalizer {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your shopping list(Please use \",\" to separate the items):");
		String[] list = myObj.nextLine().split(",");
		System.out.println("Your list contains the following items:");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		int sum = 0;
		int piece = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + list[i].length();
			piece = piece + 1;
		}
		System.out.println("The average length of the items is: " + sum / piece);
	}
}
