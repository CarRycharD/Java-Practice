package hu.ak.generics.homework.palindromqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromQueue {

	public static <T> boolean isPalindromQueue(Queue<T> queue) {
		Deque<T> deque = new LinkedList<>(queue);
		while (deque.size() > 1) {
			if (!(deque.getFirst().equals(deque.getLast()))) {
				return false;
			}
			deque.pollFirst();
			deque.pollLast();
		}

		return true;
	}

	public static <T> void print(Queue<T> queue) {
		System.out.println(queue.toString());
		if (isPalindromQueue(queue)) {
			System.out.println("This is a palindrom.");
		} else {
			System.out.println("This is not a palindrom.");
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		print(queue);
		queue.add(1);
		print(queue);
		queue.add(2);
		print(queue);
		queue.clear();
		queue.add(1);
		queue.add(3);
		queue.add(1);
		print(queue);
		queue.clear();
		queue.add(1);
		queue.add(2);
		queue.add(5);
		queue.add(3);
		queue.add(1);
		print(queue);

	}
}
