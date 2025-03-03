// bubble sorting
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] nums ={2,3,12,56,6,34,99,102,32};
        selection(9,nums);
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
    public static void selection(int n ,int[] nums){
        int temp;
        int min;
        for(int i=0;i<n-1;i++){
            min = i ;
            for(int j=i+1;j<n;j++){
               if(nums[j] < nums[min]){
                   min = j;
               }
            }
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}
