package losenord1;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String password = "Test"; // Declaring password variable.
		Scanner inputObj = new Scanner(System.in);
		int attempts = 3; // Counter for attempts left
		String userInput = "";
		while (attempts-- > 0 && !password.equals(userInput)) { // Compare input and decrement counter.
			System.out.print("Enter your password: ");
			userInput = inputObj.nextLine();

			if (userInput.equals(password))
				System.out.println("Correct password. Logging in...");
			else
				System.out.println("Incorrect password.\t" + attempts + " attempts remaining");
		}

		if (attempts < 0 && !password.equals(userInput)) { // Executes after 3 incorrect attempts.
			System.out.println("\nApplication locked!");
		}
		inputObj.close();
	}

}
