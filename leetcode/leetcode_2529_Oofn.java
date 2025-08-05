package leetcode;

public class leetcode_2529_Oofn{
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int pos=0;
        int neg=0;
        for(int num : arr){
            if(num>0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
        }
        System.out.println(Math.max(pos, neg));
    }
    
}