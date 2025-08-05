package leetcode;

public class leetcode_930 {
    public static int Atmost(int [] nums, int goal){
        int l=0;
        int sum=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                sum=sum+nums[r];
            }
            while(sum>goal){
                if(nums[l]==1){
                    sum=sum-nums[l];
                }
                l++;
            }
            count=count+(r-l+1);
        }
        return count;
    }
    public static void main(String [] args){
        int [] nums={0,0,0,0,0};
        int goal=0;
        if(goal==0){
            System.out.println(Atmost(nums, goal));
        }
        else{
            System.out.println(Atmost(nums, goal)-Atmost(nums, goal-1));
        }
    }
    
}
