import java.util.*;

public class IntersectionOfTwoArray{

    public static void main(String[] args){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(solution(nums1,nums2)));
    }

    public static int[] solution(int[] nums1, int[] nums2){
          Map<Integer,Integer> map = new HashMap<>();
          List<Integer> res = new ArrayList<>();  
          for(int i : nums1)
              map.put(i,map.getOrDefault(i,0)+1);

          for(int i : nums2){
              if(map.containsKey(i) && map.get(i)>0){
                  res.add(i);
                  map.put(i, map.getOrDefault(i,0)-1);
              }
          }
          return res.stream().mapToInt(Integer::intValue).toArray();
    }

    
}
