import java.util.Arrays;

public class HangmanWord {
    private String[] possibleWords = {"Laptop", "Monitor", "Keyboard", "Microphone"};
    private String word;
    private char[] progress;
    private int wrongCount = 0;

    public HangmanWord() {
        int rand = (int)(Math.random() * (possibleWords.length - 1) + 1);
        word = possibleWords[rand];
        progress = new char[word.length()];
        Arrays.fill(progress, '-');
    }

    public void display() {
        for (int i = 0; i < progress.length; i++) {
            System.out.print(progress[i]);
        }
        System.out.println();
    }

    public boolean guess(char c) {
        boolean matchFound = false;
        for (int i = 0; i < word.length(); i++) {
            // Just in-case the word bank contains an upper case character or the user
            // inputs a capitalized letter.
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(c)) {
                progress[i] = Character.toLowerCase(c);
                matchFound = true;
            }
        }

        if (!matchFound) {
            wrongCount += 1;
        }

        return matchFound;
    }

    public boolean isSolved() {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public int getWrongCount() {
        return wrongCount;
    }
    public String getWord() {
        return word;
    }
}
