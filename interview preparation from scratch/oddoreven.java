// finding the number is even or odd 
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        
        if(num%2==0)
        System.out.println("Even number");
        else
        System.out.println("Odd number");
    }
}
