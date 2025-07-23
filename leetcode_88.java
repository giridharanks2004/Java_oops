package leetcode;
import java.util.*;
public class leetcode_88 {
    public static void merge(int [] nums1,int m,int [] nums2,int n){
        for(int i=m,j=0;j<nums2.length;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String [] args){
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        int m=3;
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
}
