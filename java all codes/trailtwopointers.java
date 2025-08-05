
public class trailtwopointers {
    public static void main(String[] args) {
       int [] arr={1, 2, 3, 3, 1, 2,2};
       int l=0;
       int sum=0;
       int k=3;
       int maximum=Integer.MIN_VALUE;
       for(int r=0;r<arr.length;r++){
            sum=arr[r]+sum;
            while (sum>k) {
               sum=sum-arr[l];
               l++;
            }

            if(sum==k){
                maximum=Math.max(maximum, r-l+1);
            }
       }
       if(maximum!=Integer.MIN_VALUE){
            System.out.println(maximum);
       }
       else{
            System.out.println("no subbarray found");
       }
    }    
}
