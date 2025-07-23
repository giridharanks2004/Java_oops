package leetcode;

public class leetocde_410 {
    public static boolean ispossible(int [] arr,int k,int mid){
        int sum=0;
        k=k-1;
        for(int num : arr){
            if(num>mid){
                return false;
            }
            if(sum+num>mid){
                k--;
                sum=0;
            }
            sum=sum+num;
            if(k<0){
                return false;
            }
        }
        return true;
    }
    public static int bs(int [] arr,int k){
        int l=1;
        int r=(int) Math.pow(10,9);
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(ispossible(arr,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int [] arr ={7,2,5,10,8};
        int k = 2;
        System.out.println(bs(arr, k));
    }
}
