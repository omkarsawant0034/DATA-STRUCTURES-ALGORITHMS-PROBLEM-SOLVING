import java.util.*;
public class solution {

    public static int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++ ){
                if( nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;    
    }
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int result [] = twoSum(nums, target);
        System.out.println(result[0] +" "+result[1]);
    }
}