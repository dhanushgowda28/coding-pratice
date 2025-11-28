public class ReversArr{

    public static void main(String[] args){
        String str = "asdfdsa";
        System.out.println(checkPal(str,0,str.length()-1));
    }

    public static Boolean checkPal(String str, int first, int last){
        if(str.charAt(first)!=str.charAt(last)){
            return false;
        } 
        if(first<=last){
           return  checkPal(str,++first,--last);
        }
        return false;
    }

}
