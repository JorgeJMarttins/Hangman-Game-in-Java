---

# Hangman Game in Java

This is a simple implementation of the classic **Hangman** game in Java. The game allows a player to guess letters in a hidden word, with a limited number of attempts before losing.

## Features

- Randomly selects a word from a predefined list.
- Displays the word as underscores (`_`) initially.
- Allows the player to guess one letter at a time.
- Tracks the number of remaining attempts.
- Ends the game when the player either guesses the word correctly or runs out of attempts.

## How to Play

1. The game will randomly select a word from a list.
2. The word is displayed as a series of underscores (`_`).
3. You will be prompted to enter a letter.
4. If the letter is in the word, it will be revealed in the correct position.
5. If the letter is not in the word, you lose one attempt.
6. You have a total of 6 attempts to guess the word.
7. If you guess all the letters correctly before running out of attempts, you win.
8. If you run out of attempts, you lose and the correct word will be revealed.

## Requirements

- Java 8 or higher to run the game.

## Running the Game

1. Clone the repository or download the Java file.
2. Compile and run the Java program:

   ```bash
   javac HangmanGame.java
   java HangmanGame
   ```

3. Follow the on-screen prompts to guess letters.

## Code Explanation

- The game stores a list of possible words in the `words` array.
- A random word is chosen and displayed as a series of underscores (`_`), representing the letters that need to be guessed.
- The player is given 6 attempts to guess the word correctly. Each incorrect guess decreases the remaining attempts.
- The game ends either when the player guesses all letters or runs out of attempts.

## Example

```
Word: _____
Remaining attempts: 6
Enter a letter: a

Word: _a___
Remaining attempts: 6
Enter a letter: e

Word: _a___
Remaining attempts: 5
Enter a letter: p

Word: _a_p_
Remaining attempts: 5
Enter a letter: r

Word: _a_pr
Remaining attempts: 5
Enter a letter: o

Word: _a_pr_
Remaining attempts: 4
```
