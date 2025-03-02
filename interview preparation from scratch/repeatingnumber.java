// repeating number in the  array 
public class Main{
    public static void main(String args[]){
        int[] nums = {1,2,3,5,5,6};
        int result = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                continue;
            }else{
                result = nums[i];
            }
        }
        System.out.println(result);
    }
}
//output 5
