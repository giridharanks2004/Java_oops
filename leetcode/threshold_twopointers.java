package leetcode;
public class threshold_twopointers {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,4};
        int sl=3;
        int l=0;
        int sum=0;
        int n=0;
        int threshold=7;
        for(int r=0;r<arr.length;r++){
            sum=sum+arr[r];
             if(r-l==sl){
                sum=sum-arr[l];
                l++;
            }
            if(r-l+1==sl){
                System.out.println(sum);
                if(sum>=threshold){
                    n++;
                }
            }

        }
        System.out.println(n);
    }
}
