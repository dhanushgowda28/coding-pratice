import java.util.HashSet;
import java.util.Set;

public class BitwiseORsofSubarrays {
    public static int uniqueBitwiseORs(int[] nums) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        for (int num : nums) {
            Set<Integer> curr = new HashSet<>();
            curr.add(num);

            for (int p : prev) {
                curr.add(p | num);
            }

            result.addAll(curr);
            prev = curr;
        }

        return result.size();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };
        System.out.println("Unique bitwise ORs of subarrays: " + uniqueBitwiseORs(nums));
    }
}
