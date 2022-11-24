package hu.ak.generics.guessing;

import java.util.HashSet;
import java.util.Set;

public class GuessingPlayer implements Runnable {

	private final GuessingGame game;

	public GuessingPlayer(GuessingGame game) {
		this.game = game;
	}

	@Override
	public void run() {

		Set<Integer> guessedNumbers = new HashSet<Integer>();

		while (!game.isGameOver()) {
			int guess = RandomGenerator.randomNumber(11);
			if (!guessedNumbers.contains(guess)) {
				game.guess(guess);
				guessedNumbers.add(guess);

				try {
					Thread.sleep(RandomGenerator.randomNumber(4) * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
		System.out.println(Thread.currentThread().getName() + " has finsihed!");

	}
}
