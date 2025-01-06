// LCM of two numbers
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int max = Math.max(a,b);
        int lcm = max;
        sc.close();
        
        while(true){
            if(lcm%a==0 && lcm%b==0){
                break;
            }else{
              lcm+=max;
            }
            
        }
        System.out.println(lcm);
    }
}
//output 300
