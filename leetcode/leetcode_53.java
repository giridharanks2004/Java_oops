package leetcode;
public class leetcode_53 {
    public static void main(String[] args) {
        int [] arr = {1,-2,-3,4,-1,2,1,-5,4};

        int cursum=arr[0];
        int maximum=Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            cursum=Math.max(arr[i],cursum+arr[i]);
            maximum=Math.max(maximum,cursum);
        }
        System.out.println(maximum);
    }
}
