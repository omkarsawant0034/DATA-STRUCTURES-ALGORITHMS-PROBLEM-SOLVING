public class solution {
 
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int element = arr[i];
            int j = 0;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > element){
                    arr[j+1] = arr[j];
                }else{
                    break; // arr[j] <= element
                }
            }
            arr[j+1] = element;
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
        for(int element : arr ){
            System.out.print(element+" ");
        }
    }
}
