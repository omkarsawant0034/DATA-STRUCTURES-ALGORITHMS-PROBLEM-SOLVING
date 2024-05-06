//print sum of first n natuaral numbers 


public class sumNnatural {
    
    public static void sumNaturalNum(int i ,int n,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumNaturalNum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String args[]){
        sumNaturalNum(1,10, 0);
    }
}
