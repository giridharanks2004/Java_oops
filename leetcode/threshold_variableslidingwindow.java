package leetcode;
public class threshold_variableslidingwindow {
    public static void main(String [] args){
        int [] arr={1,5,3,9,2};
        int threshold_wieght=10;
        int l=0;
        int sum=0;
        int ans=0;
        for(int r=0;r<arr.length;r++){
            sum=sum+arr[r];
            while(sum>threshold_wieght){
                sum=sum-arr[l];
                l++;
            }
            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}
