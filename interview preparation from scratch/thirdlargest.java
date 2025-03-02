//third largest element in the array 
public class Main{
    public static void main(String args[]){
        int[] nums ={1,2,3,4,6,7};
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i] > second && nums[i]!=first){
                third= second;
                second = nums[i];
            } else{
                third= nums[i];
            }
        }
        System.out.println(third);
    }
}
