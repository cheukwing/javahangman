import java.util.Arrays;

public class Game {

  private char[] word;
  private int wordLength;
  private char[] guessedWord;
  private int wrongGuesses;
  private char[] guessedChars;
  private int index;

  public Game(String word) {
    this.word = word.toCharArray();
    this.wordLength = word.length();
    this.guessedWord = new char[wordLength];
    for (int i = 0; i < wordLength; i++) {
      this.guessedWord[i] = '*';
    }
    this.wrongGuesses = 0;
    this.guessedChars = new char[26];
    this.index = 0;
  }

  public char[] getWord() {
    return word;
  }

  public char[] getGuessedWord() {
    return guessedWord;
  }

  public boolean isFinished() {
    return (Arrays.equals(word, guessedWord) || wrongGuesses > 9);
  }

  public boolean isVictory() {
    return Arrays.equals(word, guessedWord);
  }

  public boolean isRightGuess (char c) {
    guessedChars[index] = c;
    index++;
    for (int i = 0; i < wordLength; i++) {
      if (word[i] == c) {
        return true;
      }
    }
    wrongGuesses++;
    return false;
  }

  public void guess(char c) {
    for (int i = 0; i < wordLength; i++) {
      if (word[i] == c) {
        guessedWord[i] = c;
      }
    }
  }

  public boolean alreadyGuessed(char c) {
    for (int i = 0; i < guessedChars.length; i++) {
      if (guessedChars[i] == c) {
        return true;
      }
    }
    return false;
  }

  public char[] getGuessedChars() {
    return guessedChars;
  }

  public int getWrongGuesses() {
    return wrongGuesses;
  }
}
