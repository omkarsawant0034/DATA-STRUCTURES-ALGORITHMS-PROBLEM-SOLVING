import java.util.*;
class solution {
    
    public static int[] SelectionSort(int nums[]){
       
        for(int i = 0; i < nums.length-1; i++){
            int min_idx = minElement(nums, i);
            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }
        return nums;
    }

    public static int minElement(int nums[],int i){
        int min_idx_ele = i;
        for(int j = i+1; i < nums.length; i++){
            if(nums[j] < nums[min_idx_ele]){
                min_idx_ele = j;
            }
        }
        return min_idx_ele;
    }

    public static void main(String args[]){
        int nums[] = {2,1,9,7,5};
        SelectionSort(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}