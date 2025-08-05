package leetcode;
import java.util.HashSet;
public class hshset {
    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        HashSet<Integer> hs = new HashSet<>();
        int dup=-1;
        int miss=-1;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                dup=arr[i];
            }
        }
        System.out.println("before the update "+hs);
        System.out.println("the duplicate is "+dup);
        for(int i=1;i<=arr.length;i++){
            if(!hs.contains(i)){
                miss=i;
                hs.add(i);
            }
        }
        System.out.println("the missing is "+miss);
        System.out.println("after the update "+hs);
    }
}
