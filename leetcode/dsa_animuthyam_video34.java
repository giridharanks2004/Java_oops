package leetcode;
public class dsa_animuthyam_video34 {
    public static void main(String [] args){
        int [] arr={1,1,0,1,0,0};
        int count=0;
        int l=0;
        int k=2;
        int ans=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]==0){
                count++;
            }
            while (count>k) {
                if(arr[l]==0){
                    count--;
                }
                l++;
            }
        ans=Math.max(ans, r-l+1); 
        }
        System.out.println(ans);
    }
    
}