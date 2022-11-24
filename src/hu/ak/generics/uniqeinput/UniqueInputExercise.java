package hu.ak.generics.uniqeinput;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueInputExercise {

	public static void main(String[] args) {

		Set<String> words = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Please type in a word!");
			String input = scanner.nextLine();
			words.add(input);
		}

		System.out.println("You entered " + words.size() + " unique inputs.");

		Iterator<String> iterator = words.iterator();

		System.out.print("These are the following: ");

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.print(next);
			if (iterator.hasNext()) {
				System.out.print(", ");
			}
		}

	}

}
