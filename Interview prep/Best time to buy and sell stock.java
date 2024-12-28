// best time to buy and sell stock
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] nums = {7,1,5,3,6,4};
        System.out.println(BuySell(nums));
        
    }
    public static int BuySell(int[] nums){
        int maxProfit = 0;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];
        
        for(int i=1;i<nums.length;i++){
            left[i] = Math.min(left[i-1],nums[i]);
        }
        for(int i = nums.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            maxProfit  = Math.max(maxProfit,right[i]-left[i]);
        }
        return maxProfit;
    }
}
// output 5
