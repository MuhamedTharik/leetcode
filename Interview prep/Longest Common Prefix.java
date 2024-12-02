//longest Common prefix
import java.util.*;
public class Main{
    public static void main(String args[]){
        String[] strs = {"Dog","flow","flight"};
        System.out.println(LongestCommonPrefix(strs));
        
    }
    
    public static String LongestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;
        
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        if(index==0){
            return "error";
        }else{
            return str1.substring(0,index);
        }
    }
}
// output
// "fl" or "error"
