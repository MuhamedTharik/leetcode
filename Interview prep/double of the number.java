// product of the sum

public class Main{
    public static void main(String args[]){
        int[] nums={10,2,4,3};
        int result = productSelf(nums);
        
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("found: "+result);
        }
        
    }
    public static int productSelf(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] == nums[j]*2 || nums[j]==nums[i]*2){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
// output found 10
