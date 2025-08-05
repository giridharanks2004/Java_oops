import java.util.Arrays;
import java.util.Stack;
//
public class next_smaller_element {
    public static void main(String[] args) {
        int [] arr = {4,5,2,10,8};
        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                ans[i]=-1;
            }
            else{
                while(!stk.isEmpty() && stk.peek()>arr[i]){
                    stk.pop();
                }
                if(!stk.isEmpty()){
                    ans[i]=stk.peek();
                    stk.push(arr[i]);
                }
                if(stk.isEmpty()){
                    ans[i]=-1;
                    stk.push(arr[i]);
                }
            }
        } 

        System.out.println(Arrays.toString(ans));
    }
}
