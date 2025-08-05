package leetcode;
import java.util.*;
public class leetcode_2144 {
    public static void main(String [] args){
        int [] arr={6,5,7,9,2,2};
        int sum=0;
        Arrays.sort(arr);
        int took=0;
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            if(took==2){
                took=0;
            }
            else{
                sum=sum+arr[i];
                took++;
            }
        }
        System.out.println(sum);
    }
}
