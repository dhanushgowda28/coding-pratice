public class TwoSum {

    public static void main(String[] args) {
        int i = 115 ;
        int sum = 0 ;
        while(i>0){
         int rem = i%10;
         sum+=rem;
         i = i/10;

        }
        System.out.println(sum);
    }

}
