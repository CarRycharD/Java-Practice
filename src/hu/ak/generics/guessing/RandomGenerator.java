package hu.ak.generics.guessing;

import java.util.Random;

public class RandomGenerator {

	public static int randomNumber(final int maxNumber) {
		Random ran = new Random();		
		return ran.nextInt(maxNumber);		
	}

}
