
import java.util.*;

public class Test{

    public static void main(String[] args){
        System.out.println(checkDuplicate("abcvf"));
    }

    public static boolean checkDuplicate(String str){
        
        Set<Character> set = new HashSet<>();
        
        for(int i = 0 ; i<str.length() ; i++){
             if (set.contains(str.charAt(i))) return true;
             set.add(str.charAt(i));
        }
        return false;
    } 
}
