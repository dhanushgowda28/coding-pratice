public class Fibanocci {

    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    String str = "ABCD";
    StringBuilder current = new StringBuilder(str);
    current.append("E");
    System.out.println(current.toString());
    current.deleteCharAt(current.length() -1);
    System.out.println(current.toString());
    }

}
