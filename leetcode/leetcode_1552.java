package leetcode;
import java.util.Arrays;

public class leetcode_1552 {
    public static boolean ispossible(int [] position,int n,int force){
        int curpos=position[0];
        n=n-1;
        for(int i=0;i<position.length-1;i++){
            if(position[i+1]-curpos>=force){
                curpos=position[i+1];
                n--;
                if(n==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static int findforce(int [] pos,int m){
        Arrays.sort(pos);
        int l=1;
        int r=pos[pos.length-1];
        while(l<=r){
            int mid = l+(r-l)/2;
            if(ispossible(pos, m, mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
    }
    public static void main(String [] args){
        int [] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(findforce(position, m));

    }
    
}