package leetcode;

public class leetcode_1283 {
    public static boolean ThresholdCheck(int [] arr,int threshold, int divisor){
        int sum=0;
        for(int num : arr){
            int result = num/divisor;
            if(num%divisor!=0){
                result++;
            }
            sum=sum+result;
        }
        if(sum<=threshold){
            return true;
        }

        return false;
    }
    public static int bs(int [] arr, int threshold, int max){
        int l=1;
        int r=max;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(ThresholdCheck(arr, threshold, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static void main(String [] args){
        int [] arr = {1,2,5,9};
        int threshold=6;
        int maximum = Integer.MIN_VALUE;
        for(int i : arr){
            maximum=Math.max(maximum, i);
        }
        System.out.println(bs(arr, threshold, maximum));

    }
}
