//gcd of a Number
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}
