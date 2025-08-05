package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class leetcode_496 {
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] ans = new int[nums2.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] fin = new int[nums1.length];
        Stack<Integer> nge = new Stack<>();
        for(int i=nums2.length-1 ; i>=0 ; i--){
            if(nge.isEmpty()){
                ans[i] = -1;
                nge.push(nums2[i]);
            }
            else{
                while(!nge.isEmpty() && nums2[i]>nge.peek()){
                        nge.pop();
                }
                if(!nge.isEmpty()){
                    ans[i] = nge.peek();
                    nge.push(nums2[i]);
                }
                else{
                    nge.push(nums2[i]);
                    ans[i] = -1;
                }
            }
        }
        for(int i = 0 ; i<nums2.length ; i++){
            hm.put(nums2[i],i);
        }
        for(int i = 0 ; i<nums1.length ; i++){
            if(hm.containsKey(nums1[i])){
                int index_val = hm.get(nums1[i]);
                fin[i] = ans[index_val];
            }
        }
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(nums1));
        System.out.println(hm);
        System.out.println(Arrays.toString(fin));
        

    }
    
}