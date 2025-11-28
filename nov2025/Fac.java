public class Fac{

    public static void main(String[] args){
    
      for(int i = 0 ; i< 10; i++){
          System.out.println(factorial(i));
      }
    }

    public static int factorial(int num){
        if(num<=1) return num;
        return num*(num-1);
    }

}
