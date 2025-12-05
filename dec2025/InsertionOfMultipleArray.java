import java.util.*;

public class InsertionOfMultipleArray{

    public static void main(String[] args){
        int[][] nums1 = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        int[][] nums2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(solution(nums1)));
	 System.out.println(Arrays.toString(solution(nums2)));
    }

    public static int[] solution(int[][] nums){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            for(int j = 0 ; j<nums[i].length ; j++ ){
                  map.put(nums[i][j], map.getOrDefault(nums[i][j],0) +1);
            }  
        }
        for(int i : map.keySet()){
             if(map.get(i)>=nums.length){
                 list.add(i);
             }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
