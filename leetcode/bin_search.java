package leetcode;
public class bin_search {
    public static int Binary_search(int [] arr ,int target,int left,int right){
        if(left<=right){
            int mid=left+right/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                return Binary_search(arr, target, left, mid-1);
            }
            else if(target>arr[mid]){
                return Binary_search(arr, target, mid+1, right);
            }

        }
        return left;
    }
    public static void main(String [] args){
        int [] arr={1,2,4,5,6};
        int result=Binary_search(arr, 3, 0,arr.length-1);
        System.out.println(result);
    }
}
