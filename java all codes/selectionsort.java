public class selectionsort {
    public static void main(String [] args){
        int MinIndex=-1;
        int temp;
        int[] arr=new int[]{4,3,5,1,2,6};
        int size=arr.length;
        System.err.println("before sorting:");
        for(int i=0;i<size;i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
        for(int i=0;i<size-1;i++){
            MinIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[MinIndex]>arr[j]){
                    MinIndex=j;
                }
                temp=arr[MinIndex];
                arr[MinIndex]=arr[i];
                arr[i]=temp;
            }
        }
        System.err.println("array after sorting:");
        for(int i=0;i<size;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
