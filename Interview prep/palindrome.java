// palindrome for string and number

public class Main{
    public static void main(String args[]){
        String s ="malayalam";
        String output = Palindrome(s);
        
        if(s.equals(output)){
            System.out.println("It is a Palindrome String");
        }else{
            System.out.println("It is not a Palindrome String");
        }

    }
    
    public static String Palindrome(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+= s.charAt(i);
        }
        return res;
    }
}
