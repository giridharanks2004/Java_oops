package leetcode;
public class threshold_slidingwindow {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,4};
        int sl=3;
        int threshold=7;
        int n=0;
        for(int i=0;i<=arr.length-sl;i++){
            int j=i+sl-1;
            int sum=0;
            for(int k=i;k<=j;k++){
                sum=sum+arr[k];
            }
            if(sum>=threshold){
                n++;
            }
        }
        System.out.println(n);
    }
}
