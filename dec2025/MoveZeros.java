import java.util.List;
import java.util.ArrayList;

public class MoveZeros{

    public static void main(String[] args){
        int nums[] = {1,0,3,12};
        moveZeroes(nums);
        for(int num : nums)
          System.out.print(num+  ", ");
    }
    
    public static void moveZeroes(int[] nums) {
        
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != 0){
              
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i,int j){
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

}
