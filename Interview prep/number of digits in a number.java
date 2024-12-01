// find the number of digits in a number

public class Main{
    public static void main(String args[]){
        int num = 567;
        System.out.println(Digit(num));
        
    }
    
    public static int Digit(int num){
        int digit=0;

        while(num>0){
            num/=10;
            digit++;
        }
        return digit;
    }
}
