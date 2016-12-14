public class Hangman {

  public static void main(String[] args) {

    System.out.println("Welcome to Dodgy Hangman!");
    System.out.println();
    String word = Util.randomWord();
    Game game = new Game(word);

    do {
      System.out.println("Word: " + new String(game.getGuessedWord()));
      System.out.println("Input your guess:");
      String guess = IOUtil.readString();
      char c = Character.toLowerCase(guess.charAt(0));

      while (guess.length() != 1 || !Character.isLetter(c) || game.alreadyGuessed(c)) {
        System.out.println("Please input a valid character:");
        guess = IOUtil.readString();
        c = Character.toLowerCase(guess.charAt(0));
      }

      if (game.isRightGuess(c)) {
        System.out.println("Correct guess!");
        game.guess(c);
      } else {
        System.out.println("Incorrect guess!");
      }

      System.out.println("Letters already guessed: " + new String(game.getGuessedChars()));
      System.out.println("Wrong guesses: " + game.getWrongGuesses());
      System.out.println();

    } while (!game.isFinished());

    System.out.println("The word was: " + new String(game.getWord()));
    if (game.isVictory()) {
      System.out.println("Congratulations!");
    } else {
      System.out.println("You lose!");
    }
    return;

  }
}
