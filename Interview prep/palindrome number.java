// plaindrome of a number

public class Main{
    public static void main(String args[]){
        int num = 565;
        int result = palindromeNumber(num);
        
        if(num == result){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }
        
    }
    public static int palindromeNumber(int num){
        int digit=0;
        int reverse =0;
        
        while(num>0){
            digit = num%10;
            reverse = reverse*10+digit;
            num/=10;
        }
        return reverse;
    }
}
