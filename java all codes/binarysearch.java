public class binarysearch {
    public static boolean valid(int[] arr){
        for(int i=0;i<(arr.length)-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int [] bsort(int[] arr){
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int bs(int [] arr,int l,int r,int s){
        if(valid(arr)){
            if(r>=l){
                int m=(l+r)/2;
                if(arr[m]==s){
                    return m;
                }
                else if(s<arr[m]){
                    return bs(arr, l, m-1, s);
                }
                else if(s>arr[m]){
                    return bs(arr, m+1, r, s);
                }
            }
        }
        else{
            int [] sorted=bsort(arr);
            System.err.println("array has been sorted and position changed:");
            return bs(sorted, l, r, s);
        }
        return -1;
    
    }
    public static void main(String [] args){
        int[] arr1=new int[]{12,4,5,6,9};
        int left=0;
        int right=arr1.length;
        int s=4;
        int index=bs(arr1,left,right,s);
        if(index==-1){
            System.err.println("not found");
        }
        else{
            System.out.println("found at index: "+index);
        }
    }
}
