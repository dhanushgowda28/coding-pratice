import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        String[] arr = { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc" };
        // [["max"],["buy"],["doc"],["may"],["ill"],["duh"],["tin"],["bar"],["pew"],["cab"]]
        //[[doc], [duh], [tin], [cab], [pew], [buy], [bar], [max], [may], [ill]]
        // [[buy], [duh, ill], [bar], [cab], [max], [doc], [may], [tin], [pew]]

        System.out.println(groupAnagrams(arr));
    }

    static public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = Arrays.toString(ch);
            if (!map.containsKey(s)) {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s, l);
            } else {
                map.get(s).add(strs[i]);
            }

        }
        return new ArrayList<>(map.values());
    }
}
