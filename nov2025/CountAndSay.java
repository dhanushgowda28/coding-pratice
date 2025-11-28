public class CountAndSay {

  public static void main(String[] args) {

    System.out.println(countAndSay(4));

  }

  public static String countAndSay(int num) {

    String res = "1";
    for (int i = 2; i <= num; i++) {
      res = encode(res);
    }
    return res;
  }

  public static String encode(String str) {
    StringBuilder res = new StringBuilder();
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        res.append(count).append(str.charAt(i - 1));
        count = 1;
      }
    }
    res.append(count).append(str.charAt(str.length() - 1));
    return res.toString();

  }

}
