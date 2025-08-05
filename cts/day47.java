package cts;

public class day47 {
    public static void main(String[] args) {
        int [] arr = {1, 2, -3, 3, -1, 2,-2};
        int sum=0;
        int k=0;
        int maxlen=0;
        int maximum = Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++){
            sum=sum+arr[r];

            while (sum==k) {
                maxlen=r+1;
            }

            maximum=Math.max(maximum,maxlen);
        }
        System.out.println(maximum);
    }   
}
