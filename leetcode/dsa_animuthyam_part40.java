package leetcode;

public class dsa_animuthyam_part40{
    public static void main(String [] args){
        int [] arr={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        int l=0;
        int count=0;
        int min=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                count++;
            }
            while(count>k){
                if(arr[l]%2!=0){
                    count--;
                }
                l++;
            }
            if(count==k){
                min=min+(r-l+1);
            }
        }
        System.out.println(min);
    }

}
