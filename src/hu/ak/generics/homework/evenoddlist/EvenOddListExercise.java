package hu.ak.generics.homework.evenoddlist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EvenOddListExercise {

	public static void main(String[] args) {

		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();

		int counter = 0;
		Scanner scanner = new Scanner(System.in);

		while (counter < 10) {
			System.out.println("Please type in a number!");
			int input = scanner.nextInt();
			if (input % 2 == 0) {
				evenList.add(input);
			} else {
				oddList.add(input);
			}
			counter++;
		}
		
		ListIterator<Integer> evenListIterator = evenList.listIterator(evenList.size());
		
		System.out.println("Even numbers:");
		while(evenListIterator.hasPrevious()) {
			System.out.println(evenListIterator.previous());
		}
		
		ListIterator<Integer> oddListIterator = oddList.listIterator();
		
		while(oddListIterator.hasNext()) {
			int current = oddListIterator.next();
			if (current % 3 == 0) {
				oddListIterator.set(current*current);
			} else if (current % 5 == 0) {
				oddListIterator.add(current);
			} else if (current % 7 == 0) {
				oddListIterator.remove();
			}
		}
		
		System.out.println("Odd numbers:\n" + oddList.toString());
	}

}
