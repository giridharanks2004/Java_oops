package leetcode;
public class threshold_avg_twopointers {
    public static void main(String[] args) {
        int [] arr={2,2,2,2,5,5,5,8};
        int l=0;
        int sl=3;
        int sum=0;
        int threshold=4;
        int n=0;
        for(int r=0;r<arr.length;r++){
            sum=sum+arr[r];
            if(r-l==sl){
                sum=sum-arr[l];
                l++;
            }
            if(r-l+1==sl){
                int avg=sum/sl;
                if(avg>=threshold){
                    n++;
                }
            }
        }

        System.out.println(n);
    }
}
