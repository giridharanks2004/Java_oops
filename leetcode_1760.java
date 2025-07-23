package leetcode;

import java.util.Arrays;

public class leetcode_1760 {
    public static boolean ispossible(int [] nums, int maxop, int divisor){
        int totalops=0;
        for(int bag : nums){
            if(bag>divisor){
                int resultant=bag/divisor;
                if(resultant%divisor!=0){
                    resultant++;
                }
                totalops=totalops+(resultant-1);
                if(totalops>maxop){
                    return false;
                }
            }
        }
        return true;
    }
    public static int checkdiv(int [] nums, int maxop){
        int l=1;
        int r=Arrays.stream(nums).sum();
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(ispossible(nums, maxop, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }            
        }

        return l;
    }
    public static void main(String [] arg){
        int [] nums = {9};
        int maxop = 2;
        System.err.println(checkdiv(nums,maxop));
        
    }
}