package com.company;

import java.util.Random;
import java.util.Scanner;


public class Hangman {
    public static final Random RANDOM = new Random();
    // Array with words that can be guessed.
    public static String[] words = {"reddit", "facebook", "java", "assignment",
            "game", "hello", "islam", "religion", "internet", "face"};
    // Randomly pick word from array.
    public static String randomWord = words[RANDOM.nextInt(words.length)];
    // Create String from picked word with char replaced by *. \0, empty spaces between chars in string.
    public static String hiddenWord = new String(new char[randomWord.length()]).replace("\0", "_");
    // Counter for attempts and Max errors.
    public static int errorCount = 0;
    public static int MAX_ERRORS = 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's start playing Hangman!\n");

        // While loop that loops as long as the game is going.
        while (errorCount < MAX_ERRORS && hiddenWord.contains("_")) {

            System.out.println("1\t Game Status");
            System.out.println("2\t Guess a single letter");
            System.out.println("3\t Guess the whole word");

            System.out.println("Select 1, 2 or 3: ");

            String menuChoice = scan.nextLine();

            // Switch case for menu choices.
            switch (menuChoice) {
                case "1":
                    int ERRORS_LEFT = MAX_ERRORS - errorCount;
                    System.out.println("\t\t Current game status!");
                    System.out.println("Wrong guesses: " + errorCount);
                    System.out.println("Guesses left: " + ERRORS_LEFT);
                    System.out.println("The word at this round: " + hiddenWord);
                    break;
                case "2":
                    System.out.println("Guess a single letter: ");
                    System.out.println(hiddenWord);
                    String singleGuess = scan.nextLine().toLowerCase();
                    playLetter(singleGuess);
                    break;
                case "3":
                    System.out.println("Guess the whole word: ");
                    System.out.println(hiddenWord);
                    String wordGuess = scan.nextLine().toLowerCase();
                    playWord(wordGuess);
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        }
        scan.close();
    }

    // Method for guessing single letter.
    public static void playLetter(String guess) {
        String currentWord = "";

        if (guess.length() <= 1) {

            // For loop that iterates through word and compares it to guess. If guess is correct it gets assigned to the correct place in placeholder.
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == guess.charAt(0)) {
                    currentWord += guess.charAt(0);
                } else if (hiddenWord.charAt(i) != '_') {
                    currentWord += randomWord.charAt(i);
                } else {
                    currentWord += "_";
                }
            }
            // If statement that controls if guessed letter is incorrect and runs method for incorrect guesses.
            if (hiddenWord.equals(currentWord)) {
                errorCount++;
                guessIncorrect();
            } else {
                hiddenWord = currentWord;
                System.out.println("Nice! " + guess + " is a correct guess!");
                System.out.println(hiddenWord);
            }
            if (hiddenWord.equals(randomWord)) {
                System.out.println("Correct! You win! The word was " + randomWord);
            }
        } else {
            System.out.println("Incorrect input. Please input only 1 character.");
        }
    }

    // Method for guessing whole word.
    public static void playWord(String guess) {

        // If statement that controls if guessed word is incorrect and runs method for incorrect guesses.
        if (guess.equals(randomWord)) {
            hiddenWord = randomWord;
            System.out.println("Congratulation! You win! The word was " + randomWord);
        } else {
            errorCount++;
            guessIncorrect();
        }
    }

    // Method for incorrect guesses.
    public static void guessIncorrect() {
        if (errorCount == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("/_|_\\");
        }
        if (errorCount == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
        }
        if (errorCount == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
        }
        if (errorCount == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println("  | /");
            System.out.println("  |/");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
        }
        if (errorCount == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println("  _________");
            System.out.println("  | /");
            System.out.println("  |/");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
        }
        if (errorCount == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println("  _________");
            System.out.println("  | /     |");
            System.out.println("  |/      |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
        }
        if (errorCount == 7) {
            System.out.println("GAME OVER!");
            System.out.println();
            System.out.println("  _________");
            System.out.println("  | /     |");
            System.out.println("  |/      |");
            System.out.println("  |       ()");
            System.out.println("  |       /|\\");
            System.out.println("  |      _/ \\_");
            System.out.println(" /|\\");
            System.out.println("/_|_\\");
            System.out.println("GAME OVER! The word was " + randomWord);
        }

    }
}


