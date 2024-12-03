// switch case
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the number from 1-7: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(switchCase(num));
    }
    
    public static String switchCase(int num){
        switch(num){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid Number";
        }
    }
}
