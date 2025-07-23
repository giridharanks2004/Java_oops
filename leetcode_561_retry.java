package leetcode;
import java.util.*;
public class leetcode_561_retry {
    static void arraypair(int [] arr){
        Arrays.sort(arr);
        int size=arr.length;
        int sum=0;
        for(int i=0;i<size;i=i+2){
            sum=sum+arr[i];
        }
        System.out.println(sum+" is the maximum!");
    }
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=inp.nextInt();
        int size=2*n;
        int [] arr=new int[size];
        System.err.println("enter "+size+" elements into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }
        arraypair(arr);
        inp.close();
    }
}
