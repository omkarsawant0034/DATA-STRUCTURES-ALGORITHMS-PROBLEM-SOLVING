public class solution {
 
    
    public static void bubbleSort(int nums[]){
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {5,7,1,3,0};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
