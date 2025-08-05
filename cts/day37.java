package cts;

import java.util.HashMap;

public class day37 {
    public static void main(String [] args){
        int [] arr={1,1,2,3,4,4,5,2};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        
        for(int Key : hm.keySet()){
            if(hm.get(Key)>1){
                System.out.print(Key+", ");
            }
        }
    }
}
