package leetcode;

public class leetcode_875 {
    public static boolean HourCheck(int [] arr,int hours,int eatSpeed){
        int totalHours=0;
        for(int pile : arr){
            int result = pile/eatSpeed;
            result++;
            totalHours=totalHours+result;
        }
        if(totalHours<=hours){
            return true;
        }
        return false;
    }
    public static int bs(int [] arr,int hours,int max){
        int l=1;
        int r=max;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(HourCheck(arr,hours,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int hours = 8;
        int maximum=Integer.MIN_VALUE;
        for(int num : arr){
            maximum=Math.max(maximum, num);
        }

        System.out.println(bs(arr, hours, maximum));

    }
}
