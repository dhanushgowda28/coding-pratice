public class RemoveDupicateArray{

    public static void main(String[] args){
        String str1 = "bcabc" ;
        String str2 = "cbacdcbc" ;  
        System.out.println(removeDup(str1));
        System.out.println(removeDup(str2));
    }

    public static String removeDup(String str){
         int[] arr = new int[26];
         for(int i = 0 ; i<str.length(); i++){
           char ch = str.charAt(i);		 
           if(ch>='a' && ch<='z') 
           arr[str.charAt(i) - 'a']++;  
         }    
         StringBuilder sb = new StringBuilder();    
         for(int i = 0 ; i<26 ; i++){
             if(arr[i]>0){
              char ch = (char)  ('a' + i);
             sb.append(ch);}
         }
        return sb.toString();
    }
    

}
