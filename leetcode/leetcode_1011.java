package leetcode;

import java.util.Arrays;

public class leetcode_1011 {
    public static boolean ispossible(int [] wieghts,int days,int shipWieght){
        int took=0;
        for(int packageWieght : wieghts){
            if(packageWieght>shipWieght){
                return false;
            }
            if(took+packageWieght>shipWieght){
                days--;
                took=0;
                if(days==0){
                    return false;
                }
            }
            took=took+packageWieght;
        }

        return true;
    }
    public static int capacity(int [] arr, int days){
        int l=1;
        int r=Arrays.stream(arr).sum(); 
        while(l<=r){
            int mid = l+(r-l)/2;
            if(ispossible(arr,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
    public static void main(String [] args){
        int [] wieghts = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(capacity(wieghts,days));
    }
}