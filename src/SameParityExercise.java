
public class SameParityExercise {

	public static void main(String[] args) {

		System.out.println(printParity(sameParity(2, 2)));
		System.out.println(printParity(sameParity(2, 3)));
		System.out.println(printParity(sameParity(3, 2)));
		System.out.println(printParity(sameParity(3, 3)));
	}

	public static boolean sameParity(int number1, int number2) {

		int remainder1 = number1 % 2;
		int remainder2 = number2 % 2;

		if (remainder1 == remainder2) {
			return true;
		} else {
			return false;
		}
	}

	public static String printParity(boolean parity) {
		if (parity == true) {
			return "Same parity";
		} else {
			return "Not same parity";
		}
	}
}
