import java.math.BigInteger;
import java.util.ArrayList;

public class Factorialsoflargenumbers {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    public static ArrayList<Integer> factorial(int n) {
        BigInteger bi = BigInteger.ONE;
      
      for(int i = 1; i<=n ; i++){
          bi = bi.multiply(BigInteger.valueOf(i));
      }
      
      ArrayList<Integer> arr = new ArrayList<>();
      
      String s = bi.toString();
      
      for(char c : s.toCharArray()){
          int val = (c - '0');
          arr.add((int) val);
      }
      
      return arr;
    }

}
