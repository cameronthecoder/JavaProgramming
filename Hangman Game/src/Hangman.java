import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        int MAX_INCORRECT = 5;
        System.out.println("Welcome to Hangman.");
        HangmanWord wordObj = new HangmanWord();
        System.out.print("Here is your word: ");
        wordObj.display();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Your guess: ");
            String guess = input.nextLine();
            char guessChar = guess.charAt(0);
            boolean isCorrect = wordObj.guess(guessChar);
            if (isCorrect) {
                System.out.println("Correct!");
                if(wordObj.isSolved()) {
                    System.out.format("You found all the letters in the word \"%s\".\n", wordObj.getWord());
                    System.out.println("You win!");
                    break;
                } else {
                    System.out.println("Progress: ");
                    wordObj.display();
                }
            } else {
                int wCount = wordObj.getWrongCount();
                if (wCount >= MAX_INCORRECT) {
                    System.out.println("Sorry, you lose.");
                    System.out.format("The word was \"%s\".", wordObj.getWord());
                    break;
                } else {
                    System.out.format("%s not found! \n", guessChar);
                    System.out.format("You have used %s out of %s missing guesses. \n", wordObj.getWrongCount(), MAX_INCORRECT);
                    wordObj.display();
                }
            }
        }
    }
}
