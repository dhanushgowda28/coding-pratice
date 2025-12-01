import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnName {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        int p = 6;

        List<List<Integer>> res = new ArrayList<>();
        subSeqArray(nums, 0, new ArrayList<>(), res);
        for (List<Integer> i : res)
            System.out.println(i);
    }

   public static void subSeqArray(int[] nums, int i, List<Integer> list, List<List<Integer>> res) {
    if (i == nums.length) {
        res.add(new ArrayList<>(list));
        return;   // ← MUST RETURN
    }

    list.add(nums[i]);
    subSeqArray(nums, i + 1, list, res);

    list.remove(list.size() - 1);
    subSeqArray(nums, i + 1, list, res);
}


}