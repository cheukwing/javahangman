public class Util {

  private static String[] words = {"apple", "banana", "cantaloupe", "french", "spanish", "german",
                                    "sasquatch", "mongoose", "duck", "computer", "computing",
                                    "imperial", "college", "london"};

  public static String randomWord() {
    int length = words.length;
    int randomIdx = (int) (Math.random() * length);
    return words[randomIdx];
  }
}
