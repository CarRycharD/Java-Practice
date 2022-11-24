package hu.ak.generics.guessing;

public class GuessingGameMain {

	public static void main(String[] args) throws InterruptedException {

		GuessingGame game = new GuessingGame();
		GuessingPlayer player1 = new GuessingPlayer(game);
		GuessingPlayer player2 = new GuessingPlayer(game);
		
		Thread t1 = new Thread(player1, "Player 1");
		Thread t2 = new Thread(player2, "Player 2");
		
		System.out.println("The game has started!");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The game has finished! The winner is " + game.getWinnerThread());
		
	}
}
