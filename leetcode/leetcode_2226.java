package leetcode;


public class leetcode_2226 {
    public static boolean ispossible(int [] arr,int k,int mid){
        int total=0;
        for(int i : arr){
            int resutant=i/mid;
            k=k-total;
            total=total+resutant;
            if(k==0){
                return true;
            }
        }
        return false;
    }
    public static int bs(int [] arr, int k){
        int l=1;
        int r=(int) Math.pow(10, 9);
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(ispossible(arr,k,mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int [] arr ={5,8,6};
        System.out.println(bs(arr, 3));
    }
}
