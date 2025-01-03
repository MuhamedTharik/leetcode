// product of the array except itself
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productArray(nums)));
        
    }
    public static int[] productArray(int[] nums){
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>-1;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }
}
//output [24, 12, 8, 6]
