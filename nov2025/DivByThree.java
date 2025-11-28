public class DivByThree{

    public static void main(String[] args){
      int[]  nums1 = {3,6,9};
      int[]  nums2 = {1,2,3,4};
      System.out.println(minmunOperation(nums1));
      System.out.println(minmunOperation(nums2));
    }

    public static int minmunOperation(int[] nums){
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            boolean sub = ( nums[i] - 1 ) % 3 == 0 ;
            boolean add = (nums[i] + 1) % 3 == 0 ;
            if(sub || add){
                count++;
            }
        }
        return count;
    }

}
