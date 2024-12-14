import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    // List of words for the game
    private static final String[] words = {"java", "programming", "developer", "computer", "hangman"};
    private static String chosenWord;
    private static char[] hiddenWord;
    private static int attempts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose a random word
        chosenWord = words[new Random().nextInt(words.length)];
        hiddenWord = new char[chosenWord.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_'; // Initialize the hidden word with underscores
        }
        attempts = 6; // Number of attempts before losing

        // Game starts
        while (attempts > 0) {
            System.out.println("\nWord: " + new String(hiddenWord));
            System.out.println("Remaining attempts: " + attempts);
            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);

            if (!playRound(letter)) {
                attempts--;
            }

            // Check if the player won
            if (new String(hiddenWord).equals(chosenWord)) {
                System.out.println("\nCongratulations! You won! The word was: " + chosenWord);
                break;
            }

            // Check if the player lost
            if (attempts == 0) {
                System.out.println("\nYou lost! The word was: " + chosenWord);
            }
        }
    }

    // Function to play a round with a letter
    private static boolean playRound(char letter) {
        boolean correct = false;
        // Check if the letter is in the word
        for (int i = 0; i < chosenWord.length(); i++) {
            if (chosenWord.charAt(i) == letter) {
                hiddenWord[i] = letter; // Replace the underscore with the letter
                correct = true;
            }
        }
        return correct;
    }
}
