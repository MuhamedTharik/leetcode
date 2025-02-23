// brute force approach for maximum subarray sum 
import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maximum = Math.max(sum,maximum);
            }
        }
        System.out.print(maximum);
    }
}
