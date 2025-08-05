package leetcode;

public class bin_search_2 {
    public static  char bs(char [] str,char target,int left,int right){
        if(left<=right){
            int mid = left + (right-left)/2;
            if(target<str[mid]){
                return bs(str, target, left, mid-1);
            }
            else if(target>str[mid]){
                return bs(str, target, mid+1, right);
            }
        }
        if(right==-1){
            return 'a';
        }

        return str[right];
    }
    public static void main(String[] args) {
        char [] arr={'c','e','g','k','y'};

        int l=0;
        int r=arr.length-1;
        char target ='b';

        System.out.println(bs(arr, target, l, r));
    }
}
