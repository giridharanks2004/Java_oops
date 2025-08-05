import java.util.*;
public class linearsearch {
    public void ls(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("value "+key+" found at index "+i);
                return;
            }
        }
        System.out.println("not found!!");
    }
    public static void main(String args[]){
        int size;
        System.out.println("enter the size the array:");
        Scanner inp=new Scanner(System.in);
        size=inp.nextInt();
        int[] arr=new int[size];
        System.out.println("enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        System.out.println("enter the value to search:");
        int s=inp.nextInt();
        linearsearch a=new linearsearch();
        a.ls(arr, s);
        inp.close();
    }
}
