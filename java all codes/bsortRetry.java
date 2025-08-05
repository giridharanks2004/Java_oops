public class bsortRetry {
    public static int [] bsort(int [] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            boolean swapped=false;
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;

                }
            }
            if(swapped==false){
                System.err.println("it's sorted already!");
                break;
            }
        }
        return arr;
    }
    public static void display(int [] arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
 public static void main(String [] args) {
    int [] arr={1,2,3,4,5};
    int [] result=bsort(arr);
    display(result);
 }
}