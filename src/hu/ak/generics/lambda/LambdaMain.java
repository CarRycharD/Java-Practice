package hu.ak.generics.lambda;

public class LambdaMain {

	public static void main(String[] args) {

		StringOperation whiteSpacesDeleter = x -> x.replaceAll(" ", "");		
		StringOperation duplicate = x -> x + x;
		StringCombiner lengthMeasurer = (x, y) -> (x.length() > y.length()) ? x : y;

		System.out.println(whiteSpacesDeleter.apply(" A B C D E "));
		System.out.println(duplicate.apply("asdf"));
		System.out.println(lengthMeasurer.combine("1234", "abcde"));
	}
}
