package leetcode;

import java.util.HashMap;

public class leetcode_992 {
    public static int Atmost_count(int [] nums, int k){
        int ans=0;
        int l=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int r=0;r<nums.length;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);

            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }

            ans=ans+(r-l+1);
        }


        return ans;
    }
    public static void main(String[] args) {
        int [] nums={1,2,1,2,3};
        int k=2;
        System.out.println(Atmost_count(nums,k)-Atmost_count(nums,k-1));
    }
}
