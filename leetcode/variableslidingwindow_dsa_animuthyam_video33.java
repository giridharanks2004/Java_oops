package leetcode;
//You are given an array and You should
//Find the maximum length of the
//subarray which has atmost k ODD
//numbers
public class variableslidingwindow_dsa_animuthyam_video33 {
    public static void main(String[] args) {
        int [] arr={12,1,3,1,1,6,7,1,8,1};
        int k=2;
        int l=0;
        int count=0;
        int ans=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                count++;
            }
            while (count>k) {
                if(arr[l]%2!=0){
                    count--;
                }
                l++;
            }
            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}
