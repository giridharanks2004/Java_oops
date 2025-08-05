package leetcode;

public class leetcode_1482 {
    public static boolean ispossible(int [] arr,int countofB,int countFlowers,int days){
        int took=0;
        for(int daystook : arr){
            if(days>=daystook){
                took++;
                if(took>=countFlowers){
                    countofB--;
                    took=0;
                }
            }
            else{
                took=0;
            }
            
            if(countofB==0){
                return true;
            }
        }
        return false;
    }
    public static int leastDay(int [] arr,int countofB, int countFlowers,int max){
        int totalflowers= countofB * countFlowers;
        int numberOfFlowera=arr.length;
        if(totalflowers>numberOfFlowera){
            return -1;
        }
        int l=1;
        int r=max;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(ispossible(arr,countofB,countFlowers,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return l;

    }
    public static void main(String[] args) {
        int [] arr = {1,10,3,10,2};
        int m = 3;
        int k = 2;
        int maximum=0;
        for(int days : arr){
            maximum=Math.max(days, maximum);
        }

        System.out.println(leastDay(arr,m,k,maximum));
    }
}
