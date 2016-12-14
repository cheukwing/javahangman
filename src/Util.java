public class Util {

  private static String[] words = {"apple", "banana", "cantaloupe", "french", "spanish", "german",
                                    "sasquatch", "mongoose", "duck", "computer", "computing",
                                    "imperial", "college", "london", "platform", "plugin",
                                    "update", "idea", "ready", "ware", "virtual", "machine",
                                    "linux", "windows", "mac", "macintosh", "microsoft",
                                    "foundation", "deadbeat", "memes", "dank", "harambe"};

  public static String randomWord() {
    int length = words.length;
    int randomIdx = (int) (Math.random() * length);
    return words[randomIdx];
  }
}
