import java.util.*;

public class two_sum {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int target=9;
        HashMap <Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(!hmap.containsKey(complement)){
                hmap.put(arr[i], i);
            }
            else{
                int [] arr1={hmap.get(complement),i};
                System.out.println(Arrays.toString(arr1));
                break;
            }
        }
    }
}
