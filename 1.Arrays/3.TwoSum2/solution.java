public class solution {
    
    public static int [] twosum(int[] numbers, int taraget ){
       
        int result[] = new int[2];
        int i = 0; 
        int j = numbers.length-1;
       
        while(i < j){

            if(numbers[i] + numbers[j] == taraget){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }

            if(numbers[i] + numbers[j] > taraget){
                j--;
            }
            else{
                i++;
            }
        }

        return result;
    }

    public static void main(String args[]){
        int numbers[] = {2,7,11,15};
        int  target = 9;
        int ans[] = twosum(numbers, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
