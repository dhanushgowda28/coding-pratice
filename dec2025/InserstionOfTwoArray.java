import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class InserstionOfTwoArray{

    public static void main(String[] args){
        int[] nums1 = {9};
        int[] nums2 = {9,4,9,8,4};
	int[] res = intersection(nums1,nums2);
	System.out.println(Arrays.toString(res));
    }
    
   
    public static int[] intersection(int[] nums1, int[] nums2){
      Set<Integer> set1 = new HashSet<>();
      for(int i : nums1)
         set1.add(i);  
        
      Set<Integer> res = new HashSet<>();
      for(int i : nums2){
        if(set1.contains(i)){
            res.add(i);
        }
      }
      return res.stream().mapToInt(Integer::intValue).toArray();
    }

}
