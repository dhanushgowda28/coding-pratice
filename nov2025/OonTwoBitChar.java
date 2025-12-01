import java.util.ArrayList;
import java.util.List;

public class OonTwoBitChar {

    public static void main(String[] args){
	    int[] str1 = {1,0,0};  
		int[] str2 = {1,0,1,0};
		System.out.println(isOneBitCharacter(str1));
		System.out.println(isOneBitCharacter(str2));
		List<Integer> list = new ArrayList<>();
	}
	
	public static boolean isOneBitCharacter(int[] nums){
	    int l = nums.length ;
		boolean b = true;
	    for (int i = 0 ; i < nums.length  ; i++ ){
		    if(nums[i] == 1){
			    i++;
			b = false;
			} else {
	            b = true;		
			}
		}
	return b;
	}
}
