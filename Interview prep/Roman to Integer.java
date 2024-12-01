// roman to integer
import java.util.*;
public class Main{
    public static void main(String args[]){
        String s = "I, V, X, L, C, D, M";
        System.out.println(romanInteger(s));
        
    }
    
    public static int romanInteger(String s){
        Map<Character,Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = map.get(s.charAt(s.length()-1));
        
        for(int i = s.length()-2;i>=0;i--){
            if(s.charAt(i)<s.charAt(i+1)){
                result-=map.get(s.charAt(i));
            }else{
                result+=map.get(s.charAt(i));
            }
        }
        return result;
    }
}

// Time complexity is O(n)
// space complexity is O(1)
