package leetcode;

public class leetocode_209 {
    public static void main(String[] args) {
        int target=7;
        int [] nums={2,3,1,2,4,3};
        int sum=0;
        int min=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum=sum+nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum=sum-nums[l];
                l++;
            } 
        }
        System.out.println(min);
    }
}
