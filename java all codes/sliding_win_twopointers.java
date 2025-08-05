public class sliding_win_twopointers {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        int size=arr.length;
        int l=0;
        int temp=0;
        int ans=0;
        int sl=3;
        for(int r=0;r<size;r++){
            temp=temp+arr[r];
            if(r-l==sl){
                temp=temp-arr[l];
                l++;
            }
            if(r-l+1==sl){
                ans=Math.max(ans, temp);
            }
        }
        System.out.println(ans);
    }
}
