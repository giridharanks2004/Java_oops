public class slidingwindow1 {
    public static void main(String [] args){
        int [] arr={1,2,3,4};
        int sum=0;
        int size=arr.length;
        int sl=3;
        for(int i=0;i<size-sl+1;i++){
            int j=i+sl-1;
            for(int k=i;k<=j;k++){
                System.err.print(arr[k]+" ");
                sum=sum+arr[k];
            }
            
        }
    }
}
