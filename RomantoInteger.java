import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    public static void main(String[] args) {

        String s = "LVIII";
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = map.get(s.charAt(i));
            if (i < n - 1 && j < map.get(s.charAt(i + 1))) {
                sum -=  j;
                i++;
            } else {
                sum += j;
            }

        }
       System.out.println(sum);
    }

}
