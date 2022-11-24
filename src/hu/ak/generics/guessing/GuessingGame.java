package hu.ak.generics.guessing;

public class GuessingGame {

	private final int secretNumber;
	private String winnerThread;

	public GuessingGame() {
		this.secretNumber = RandomGenerator.randomNumber(11);
		System.out.println("The secret number is: " + secretNumber);
	}

	public String getWinnerThread() {
		return winnerThread;
	}

	synchronized boolean isGameOver() {
		return winnerThread != null;
	}

	public synchronized void guess(int tip) {
		if (!isGameOver()) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "'s tip is: " + tip);
			if (tip == secretNumber) {
				this.winnerThread = threadName;
			}
		}
	}

}
