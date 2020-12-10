package stenSaxPaseAI;

import java.util.Scanner;
import java.util.Random;

public class StenSaxPaseAI {

	public static void main(String[] args) {
		
		String firstMove = null;
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!\n"
				+ "To select your weapon, Input:\n 1 or Rock.\n 2 or Paper.\n 3 or Scissors. \n");
		
		// Takes input from user and saves it in variable.
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
		
		calculateWinner(firstMove, makeAiMove());
		
		reader.close();
	}
	
	// Method for generating AI move and saving it in variable.
	public static String makeAiMove() {

		int randomInt;
		String secMove ="";
		Random getRandom = new Random();
		randomInt = getRandom.nextInt(3)+1;
		if (randomInt == 1) {
			secMove = "1";
		} else if (randomInt == 2) {
			secMove = "2";
		} else if (randomInt == 3) {
			secMove = "3";
		}
		
		return secMove;
	}

	// Method for printing AI move and calculating winner.
	public static void calculateWinner(String player1, String player2) {
		
		if (player2.equals("1")) {
			System.out.println("The AI selected ROCK\n");
		} else if (player2.equals("2")) {
			System.out.println("The AI selected PAPER\n");
		} else if (player2.equals("3")) {
			System.out.println("The AI selected SCISSORS\n");
		}	

		if (player1.equals(player2)) {
			System.out.println("The round was a draw!");

		} else if (player1.equals("1") && player2.equals("2")) {
			System.out.println("PAPER beats ROCK. The AI wins!");

		} else if (player1.equals("1") && player2.equals("3")) {
			System.out.println("ROCK beats SCISSORS. Player 1 wins!");

		} else if (player1.equals("2") && player2.equals("1")) {
			System.out.println("PAPER beats ROCK. Player 1 wins!");

		} else if (player1.equals("2") && player2.equals("3")) {
			System.out.println("SCISSORS beats PAPER. The AI wins!");

		} else if (player1.equals("3") && player2.equals("1")) {
			System.out.println("ROCK beats SCISSORS. The AI wins!");

		} else if (player1.equals("3") && player2.equals("2")) {
			System.out.println("SCISSORS beats PAPER. Player 1 wins!");

		} else {
			System.out.println("\nInvalid input!\n" + "Correct inputs: 1 or Rock.  2 or Paper. 3 or Scissors");
		}
		
	}

}
