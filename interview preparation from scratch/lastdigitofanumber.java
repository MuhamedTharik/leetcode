// finding the last digit in a Number
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int digit = num%10;
        System.out.println(digit);
    }
}
