import java.util.Arrays;
public class SquaresOfSortedArray{

    public static void main(String[] args){
       int[] nums =  {-11,-1,0,3,10};
       System.out.println(Arrays.toString(solution(nums)));
    }

    public static int[] solution(int[] nums){
        int i = 0 ; 
        int j = nums.length - 1;
        int n = nums.length ;
        int[] res = new int[n];
        n--;
        while(i<=j){
            int first = nums[i] * nums[i];
            int last = nums[j] * nums[j];
            if( first >= last ) {
                    res[n--] = first;
                    
                    i++;
            } else {
                  res[n--] = last;
                   
                  j--;
            }
        }
       return res;
    }

}
