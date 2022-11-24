import java.util.*;

public class StringReverser {

	public static void main(String[] args) {

		Scanner userInputRequest = new Scanner(System.in);
		System.out.println("Enter a word and watch how I reverse it!");
		String userInput = userInputRequest.nextLine();
		System.out.println(reverser(userInput));

	}

	public static String reverser(String userinput) {

		char[] chars = userinput.toCharArray();

		for (int left = 0, right = chars.length - 1; left < right; left++, right--) {

			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

		}

		String output = String.valueOf(chars);

		return output;
	}

}