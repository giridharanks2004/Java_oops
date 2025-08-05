package leetcode;
import java.util.HashMap;

public class hmap {
    public static void main(String[] args) {
        int [] arr={1,1,2,1,2};
        HashMap<Integer,Integer> map1= new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(map1.containsKey(arr[i])){
                ans=ans+map1.get(arr[i]);
                map1.put(arr[i],map1.get(arr[i])+1);
            }
            else{
                map1.put(arr[i],1);
            }
        }
        System.out.println(ans);

    }
    
}
