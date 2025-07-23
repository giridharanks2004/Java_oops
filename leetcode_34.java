package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_34 {
    public static int leftMost(int [] nums , int target){
        int l=0;
        int r=nums.length-1;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(target <= nums[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=nums.length){
            return -1;
        }
        if(nums[l]!=target){
            return -1;
        }
        return l;
    }
    public static int rigthMost(int [] nums , int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target>=nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=target){
            return -1;
        }
        return r;
    } 
    public static void main(String [] args){
        int [] nums = {};
        List<Integer> ls = new ArrayList<>();
        int target=0;
        ls.add(leftMost(nums,target));
        ls.add(rigthMost(nums,target));
        System.out.println(ls);

    }
}
