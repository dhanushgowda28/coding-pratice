import java.util.*;

public class Recursion{

    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList()<>();
        int[] nums = {1,2,1};
        recursionSum(nums,0,new ArrayList<>(),res,0,2);
        for(List<Integer> list : res)
          System.out.println(list);
    }

    public static void recursionSum(int []nums, int i, List<Integer> list, List<List<Integer>> res, int sum,int k ){
        if(sum == k) res.add(list);
        if(i == nums.length){return;}
        
        list.add(nums[i]);
        recursionSum(nums,i+1,list,res,sum+nums[i],k); 
        int temp = list.get(list.size()-1); 
        list.remove(temp);
        recursionSum(nums,i+1,list,res,sum+temp,k);
            
    }

}