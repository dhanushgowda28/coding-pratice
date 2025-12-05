import java.util.List;
import java.util.ArrayList;

public class PalSubstring{

    public static void main(String[] args){

        String str = "bab";
        List<String> list = new ArrayList<>();
        zeroLast(str,list,0,"");
        for(String s : list){
            System.out.println(s);
        }
        
    }
    
   
    public static void zeroLast(String str, List<String> list, int i, String temp){
        if(i == str.length()){
            list.add(temp);
            return;
        }
        temp += str.charAt(i);
        zeroLast(str,list,i+1,temp);
        temp = temp.substring(0,temp.length()-1);
        zeroLast(str,list,i+1,temp);
          
    }

}
