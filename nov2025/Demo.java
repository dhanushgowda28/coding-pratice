import java.util.*;

public class Demo{

    public int res = 0;

    public static void main(String[] args){
       int[] nums = {3,1,4,2}; int p = 6;

       List<List<Integer>> res = new ArrayList<>();
       subSeqArray(nums,0,new ArrayList<>(),res);
       for(List<Integer> i : res)
          System.out.println(i);
    }
    
   
    public static void subSeqArray(int[] nums, int i, List<Integer> list,List<List<Integer>> res){
        if(i== nums.length){
            res.add(new ArrayList<>(list));
        }    
        list.add(nums[i]);
        subSeqArray(nums,i+1,list,res);
        list.remove(list.size()-1);
        subSeqArray(nums,i+1,list,res);   
    }

}
