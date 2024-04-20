import java.util.*;

class solution {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] SqArr = new int[n];

        for (int i = 0; i < n; i++) {
            SqArr[i] = nums[i] * nums[i];
        }

        Arrays.sort(SqArr);

        return SqArr;
    }

    public static void main(String args[]){
       int[] nums = {-4,-1,0,3,10};
       int result[] = sortedSquares(nums);
       for(int i = 0; i < nums.length; i++){
            System.out.print(result[i]+" ");
       }
    }
}