import java.util.*;

public class nfactorial {
    
    public static int nfact(int n){
        if(n == 0 || n == 1)return 1;
        return n = n * nfact(n-1); 
    }
    public static void main(String args[]){
            int n = 5;
            int ans = nfact(n);
            System.out.println(ans);
    } 
}