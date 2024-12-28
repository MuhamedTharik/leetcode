// jump game
public class Main{
    public static void main(String args[]){
        int[] nums ={2,3,1,1,4};
        System.out.println(Game(nums));
        
    }
    public static boolean Game(int[] nums){
        int reachable = 0;
        for(int i=0;i<nums.length;i++){
            if(reachable<i){
                return false;
            }else{
                reachable = Math.max(reachable,i+nums[i]);
            }
        }
        return true;
    }
}
// output true
