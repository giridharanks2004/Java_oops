package leetcode;
import java.util.*;
public class leetcode_1984 {
    public static void main(String[] args) {
        int [] arr={9,4,7,1};
        Arrays.sort(arr);
        int minvalue=Integer.MAX_VALUE;
        int sl=2;
        for(int i=0;i<=arr.length-sl;i++){
            int j=i+sl-1;
            int diff=arr[j]-arr[i];
            minvalue=Math.min(minvalue, diff);
        }
        System.out.println(minvalue);
    }
}
