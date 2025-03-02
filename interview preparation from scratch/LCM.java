// LCM of two numbers

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.println(LCM(a,b));
    }
    public static int GCD(int a,int b){
        while(b!=0){
        int temp = b;
        b = a%b;
        a=temp;
        }
        return a;
    }
    public static int LCM(int a,int b){
        if(a == 0 || b == 0){
            return a;
        }
        else{
            return (a*b)/GCD(a,b);
        }
    }
}
