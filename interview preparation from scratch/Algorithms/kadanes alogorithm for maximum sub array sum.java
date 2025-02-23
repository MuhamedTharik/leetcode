// kadane's  approach for maximum subarray sum 
import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int maximum = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maximum = Math.max(sum,maximum);
        }
        System.out.print(maximum);
    }
}
