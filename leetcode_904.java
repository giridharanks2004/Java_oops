package leetcode;

import java.util.*;

public class leetcode_904 {
    public static void main(String [] args){
        HashMap<Integer,Integer> hs= new HashMap<>();
        int [] arr={1,2,3,2,2};
        int l=0;
        int ans=0;
        int k=2;
        for(int r=0;r<arr.length;r++){
            hs.put(arr[r],hs.getOrDefault(arr[r],0)+1);
            while (hs.size()>k) {
                hs.put(arr[l],hs.get(arr[l])-1);
                if(hs.get(arr[l])==0){
                    hs.remove(arr[l]);
                }
                l++;
            }
            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}
