public class Word {

  private static String[] words = {"apple", "banana", "cantaloupe"};

  public static String randomWord() {
    int length = words.length;
    int randomIdx = (int) (Math.random() * length);
    return words[randomIdx];
  }

}
