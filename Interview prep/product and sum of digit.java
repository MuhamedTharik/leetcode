// find the sum and product of the digit

public class Main{
    public static void main(String args[]){
        int num=567;
        sumProduct(num);
    }
    public static void sumProduct(int num){
        int digit=0;
        int product=1;
        int sum=0;
        
        while(num>0){
            digit = num%10;
            product*=digit;
            sum+=digit;
            num/=10;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+product);
    }
}

// output
// The sum is: 18
// The product is: 210
