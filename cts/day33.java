package cts;

import java.util.Arrays;

public class day33 {
    public static void main(String[] args) {
        int [] arr={4,2,8,6,15,5,9,20};
        int mid = arr.length/2;
        for(int i=0;i<mid-1;i++){
            for(int j=i+1;j<mid;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=mid;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
