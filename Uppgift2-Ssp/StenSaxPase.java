package stenSaxPase;

import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {

		String firstMove = null;
		String secMove = null;
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!\n"
				+ "To select your weapon, Input:\n 1 or Rock.\n 2 or Paper.\n 3 or Scissors. \n");

		// Takes input from users and saves it in variable.
		System.out.print("Player 1 select your weapon: ");
		firstMove = reader.next().toUpperCase();
		// If statement to allow user to input text or number.
		if (firstMove.equals("ROCK")) {
			firstMove = "1";
		} else if (firstMove.equals("PAPER")) {
			firstMove = "2";
		} else if (firstMove.equals("SCISSORS")) {
			firstMove = "3";
		}
		// Takes input from users and saves it in variable.
		System.out.print("Player 2 select your weapon: ");
		secMove = reader.next().toUpperCase();
		// If statement to allow user to input text or number.
		if (secMove.equals("ROCK")) {
			secMove = "1";
		} else if (firstMove.equals("PAPER")) {
			secMove = "2";
		} else if (firstMove.equals("SCISSORS")) {
			secMove = "3";
		}

		calculateWinner(firstMove, secMove);

		reader.close();
	}
	
	// Method for calculating winner.
	public static void calculateWinner(String player1, String player2) {

		if (player1.equals(player2)) {
			System.out.println("The round was a draw!");

		} else if (player1.equals("1") && player2.equals("2")) {
			System.out.println("PAPER beats ROCK. Player 2 wins!");

		} else if (player1.equals("1") && player2.equals("3")) {
			System.out.println("ROCK beats SCISSORS. Player 1 wins!");

		} else if (player1.equals("2") && player2.equals("1")) {
			System.out.println("PAPER beats ROCK. Player 1 wins!");

		} else if (player1.equals("2") && player2.equals("3")) {
			System.out.println("SCISSORS beats PAPER. Player 2 wins!");

		} else if (player1.equals("3") && player2.equals("1")) {
			System.out.println("ROCK beats SCISSORS. Player 2 wins!");

		} else if (player1.equals("3") && player2.equals("2")) {
			System.out.println("SCISSORS beats PAPER. Player 1 wins!");

		} else {
			System.out.println("\nInvalid input!\n" + "Correct inputs: 1 or Rock.  2 or Paper. 3 or Scissors");
		}
	}

}
