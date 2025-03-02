// missing number in the  array 
public class Main{
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,8,9};
        int n = nums.length;
        int expected_sum = (n+1)*(n+2)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        expected_sum = expected_sum - sum;
        System.out.println(expected_sum);
    }
}
//output 7
