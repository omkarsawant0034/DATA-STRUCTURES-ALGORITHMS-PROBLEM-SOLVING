
//https://leetcode.com/problems/merge-sorted-array/description/

import java.util.*;

public class solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j =  0, k = 0;
        int result[] = new int[m+n];

        while((i < m) && (j < n)){
            
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
                k++;
            }else{
                result[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            result[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        for(int p = 0; p < nums1.length; p++){
            nums1[p] = result[p];
        }
    }
    public static void main(String args[]){
        int []nums1 = {1,2,3,0,0,0};
        int m = 3; 
        int [] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
        for(int i : nums1){
            System.out.print(i+" ");
        }
    }
}
