// minimu sub array of the array
// sliding window
import java.util.*;

public class Main{
    public static void main(String args[]){
        int[] nums={2,3,1,2,4,3};
        int target =7;
        System.out.println(minimumSize(target,nums));
        
    }
    public static int minimumSize(int target,int[] nums){
        int currSum=0;
        int window = Integer.MAX_VALUE;
        int start=0;
        int end = 0;
        
       
        
        for(end=0;end<nums.length;end++){
            currSum+=nums[end];
            while(currSum>=target){
                window = Math.min(window,end-start+1);
                currSum-=nums[start];
                start++;
            }
        }
        return window == Integer.MAX_VALUE ? 0 : window;
    }
}
// //output 2 because the size of the first subarray [2,3,1,2] = 7 in which the size is 4 and the second subarray [1,2,4] its size is 3 and the last subarray [4,3] its size 2 
// conparing all the three subarray the third subarray ledth is comparativly less when comparing to other subarrays so the answer is 2
