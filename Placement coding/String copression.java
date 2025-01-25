import java.util.*;
public class Main{
    public static void main(String args[]){
       String t = "aaabbddddccaa";
       int count = 1;
       String res = " ";
       for(int i=0;i<t.length();i++){
           if(i+1<t.length() && t.charAt(i)==t.charAt(i+1)){
               count++;;
           }else{
               res+=t.charAt(i);
               res+=count;
               count=1;
           }
       }
       System.out.print(res);
    }
}
