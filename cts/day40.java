package cts;


import java.util.Arrays;
import java.util.HashMap;

public class day40{
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int target = 10;
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(!hm.containsKey(complement)){
                hm.put(arr[i],i);
            }
            else if(hm.containsKey(complement)){
                int [] arr2 = {complement,arr[i]};
                System.out.println(Arrays.toString(arr2));
            }
            else{
                System.out.println("no pairs found");
            }
        }
    }  
}
