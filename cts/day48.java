package cts;
public class day48 {
    public static void main(String [] args){
        int [] arr ={2, 1, 5, 1, 3, 2};
        int l=0;
        int sum=0;
        int maximum=Integer.MIN_VALUE;
        int k = 3;
        for(int r=0;r<arr.length;r++){
            sum=sum+arr[r];
            if(r-l==k){
                sum=sum-arr[l];
                l++;
            }
            if(r-l+1==k){
                 maximum=Math.max(maximum, sum);
            }
        }
        System.out.println(maximum);
    }
}
