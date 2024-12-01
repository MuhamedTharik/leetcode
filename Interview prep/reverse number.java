// reversing the number

public class Main{
    public static void main(String args[]){
        int num = 567;
        reverseNumber(num);
        
    }
    public static void reverseNumber(int num){
        int digit=0;
        while(num>0){
            digit = num%10;
            System.out.print(digit);
            num/=10;
        }
    }
}
// output
// 765
