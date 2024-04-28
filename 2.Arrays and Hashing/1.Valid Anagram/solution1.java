import java.util.*;

public class solution1 {
    public static boolean isValid(String s,String t){
        
        if(s.length() != t.length()) return false;
        
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String args[]){
        String s = "anagram"; 
        String t = "nagaram";
        System.out.println(isValid(s, t));
    }
}
