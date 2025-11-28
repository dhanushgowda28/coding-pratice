import java.util.*;

public class BinaryPrifix{

    public static void main(String[] args){
        int[] nums = {0,1,1};
	System.out.println(prefixdivBy5(nums));
    }

    public static List<Boolean> prefixdivBy5(int[] nums){
        String bin = "";
        List<Boolean> res = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
             bin+=nums[i];
             res.add(checkdecimal(Integer.parseInt(bin)));
        }
        return res;
    }
    public static boolean checkdecimal(int num){
        int decimal = 0 ; 
        int base = 1;
        while(num!=0){
            int rem = num%10;
            num /=10;
            decimal += rem * base;
            base *=2; 
        }
        return decimal % 5 == 0 ;
    } 
}
