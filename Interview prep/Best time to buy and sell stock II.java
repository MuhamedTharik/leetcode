// best time to buy and sell stock II
public class Main{
    public static void main(String args[]){
        int[] nums ={7,1,5,3,6,4};
        System.out.println(Profit(nums));
        
    }
    public static int Profit(int[] nums){
        int profit = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                profit+=nums[i]-nums[i-1];
            }
        }
        return profit;
    }
}
// output 7
