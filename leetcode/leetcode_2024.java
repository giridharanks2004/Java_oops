package leetcode;
// find a maximum size of subarray with K number 0's or 1's that can be replaced by it's complement to 
// get consecutive 1's or 0's in that maximum subarray
public class leetcode_2024 {
    public static void main(String [] args){
        int [] arr={0, 0, 1, 1, 0, 0, 1, 1, 1};
        int k=2;
        int l=0;
        int count_1=0;
        int count_0=0;
        int ans=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]==1){
                count_1++;
            }
            if(arr[r]==0){
                count_0++;
            }
            while(Math.min(count_1, count_0)>k){
                if(arr[l]==1){
                    count_1--;
                }
                if(arr[l]==0){
                    count_0--;
                }
                l++;
            }

            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}
