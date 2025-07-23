package leetcode;

public class leetcode_1248 {
    public static int no_of_subbnumsays(int [] nums, int k){
        int l=0;
        int sum=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2 != 0){
                count++;
            }
            while(count>k){
                if(nums[l]%2 != 0){
                    count--;
                }
                l++;
            }
            sum=sum+(r-l+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] nums={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        System.out.println(no_of_subbnumsays(nums, k)-no_of_subbnumsays(nums, k-1));
    }

    
}
