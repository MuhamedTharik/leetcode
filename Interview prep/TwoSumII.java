// two sum II input array
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] nums={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        
    }
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req_num = target-nums[i];
            if(map.containsKey(req_num)){
                int[] nums1={map.get(req_num)+1,i+1};
                return nums1;
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
//output [1,2]
