package cts;

import java.util.HashSet;

public class day42 {
    public static void main(String [] args){
        int [] arr ={3,4,-1,1};
        int ans = Integer.MAX_VALUE;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hSet.add(arr[i]);
        }
        
        for(int i=1; i<arr.length; i++){
            if(!hSet.contains(i)){
                ans=Math.min(ans, i);
            }
        }

        System.out.println(ans);

    }
}
