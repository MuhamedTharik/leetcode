// hindex
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] nums ={3,0,6,1,5};
        System.out.println(hIndex(nums));
        
    }
    public static int hIndex(int[] nums){
       int h_index = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int h = nums.length-i;
            if(nums[i]>=h){
                h_index = h;
                break;
            }
        }
        return h_index;
    }
}
//output 3
