// conatiner with most water
import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] height ={1,1};
        System.out.println(mostWater(height));
        
    }
    
    public static int mostWater(int[] height){
        int left = 0;
        int right = height.length-1;
        int max=0;
        
        while(left<right){
             max = Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
// output 1
