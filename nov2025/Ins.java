import java.util.*;
public class Ins{

    public static void main(String[] args){
        int[] nums = { 7, 3, 5, 2, 1, 8, 9 };
        System.out.println(Arrays.toString(dfs(nums)));
    }

    public static int[] dfs(int[] nums){
        
         for(int i = 0 ; i < nums.length ; i++){
             int key = nums[i];
             int j = i-1;
             while(j>=0 && nums[j]>key){
               nums[j+1] = nums[j];              
                 j--;
             }
	     nums[j+1] = key;
         }
         return nums;
        
    }

}
