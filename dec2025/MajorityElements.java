import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class MajorityElements{

    public static void main(String[] args){
       
        int[] nums2 = {1,2,2,2,3,3,4};
	System.out.println(Arrays.toString(majorElement(nums2)));
    }
    
   
    public static int[] majorElement(int[] nums){
        int times = (int) nums.length / 3;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i< nums.length ; i++){
            int count = 0 ; 
            while(i < nums.length && nums[i] == nums[i-1]){
                i++;
                count++;
            }
            if(count >= times) list.add(nums[i-1]);

           

        }
       return list.stream().mapToInt(Integer::intValue).toArray();     
    }

}
