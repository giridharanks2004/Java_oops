package leetcode;

import java.util.Arrays;

class leetcode_2064_binsearch {
    public static boolean ispossible(int [] quant, int shops, int split){
        int total=0;
        for(int choclates : quant){
            int shopcount=choclates/split;
            if(choclates%split!=0){
                shopcount++;
            }
            total=total+shopcount;
            if(total>shops){
                return false;
            }
        }
        return true;
    }
    public static int properSplit(int [] quant,int shops,int avg){
        int l=1;
        int r=avg;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(ispossible(quant, shops, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int n=6;
        int [] quant={11,6};
        int avg = Arrays.stream(quant).sum()/quant.length;
        System.out.println(properSplit(quant, n, avg));
    }

}