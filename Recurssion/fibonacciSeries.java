
// Fibonacci Sequence

public class fibonacciSeries {
   
    public static void fibonacci(int i,int j,int n){
        if(n == 0) return;
        int p = i + j;
        System.out.print(" "+p+" ");
        fibonacci(j, p, n-1);
    }
    public static void main(String args[]){
        int i = 0,j = 1,n = 10;
        System.out.print(i+" "+j);
        fibonacci(i, j, n-2);
   } 
}


// public class fibonacciSeries {
   
//     public static void fibonacci(int i,int j,int n,int m){
//         if(n == m) return;
//         int p = i + j;
//         System.out.print(" "+p+" ");
//         fibonacci(j, p, n-1,m++);
//     }
//     public static void main(String args[]){
//         int i = 0,j = 1,n = 10,m = 1;
//         System.out.print(i+" "+j);
//         fibonacci(i, j, n-2,m);
//    } 
// }