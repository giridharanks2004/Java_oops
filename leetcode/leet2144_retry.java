package leetcode;
import java.util.*;
public class leet2144_retry {
    public static void main(String [] args){
        int [] arr={6,5,7,9,2,2};
        Arrays.sort(arr);
        int took=0;
        int sum=0;
        for(int i=arr.length-1;i>0;i--){
            if(took==2){
                took=0;
            }
            else{
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
