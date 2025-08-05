package leetcode;
import java.util.*;
public class leetcode_561 {
    public static void main(String [] args){
        int [] arr={6,2,6,5,1,2};
        int sum=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-2+1;i=i+2){
            int j=i+2-1;
            int min=Math.min(arr[i],arr[j]);
            sum=sum+min;
        }
        System.out.println(sum);
    }
}
