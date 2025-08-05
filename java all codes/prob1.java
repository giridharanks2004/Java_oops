//1.Find the maximum and minimum element in an array.
import java.util.*;;
public class prob1{
    public static void main(String args[]){
        int[] arr=new int[5];
        Scanner inp=new Scanner(System.in);
        int size=arr.length;
        System.err.println("enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        System.err.println("displaying:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        int min,max;
        min=max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        inp.close();
    }
}

