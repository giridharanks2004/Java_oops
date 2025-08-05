package cts;

import java.util.ArrayList;
import java.util.List;

public class day50 {
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        List<Integer> lst = new ArrayList<>();
        int k=3;
        int l=0;
        int maximum = Integer.MIN_VALUE;
        for(int r=0 ; r<arr.length ; r++){
            maximum=Math.max(maximum, arr[r]);
            if(r-l == k){
                l++;
            }
            if(r-l+1 == k){
                lst.add(maximum);
            }
        }
        System.out.println(lst);
    }
}
