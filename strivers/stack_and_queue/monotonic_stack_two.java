

import java.util.Arrays;
import java.util.Stack;

public class monotonic_stack_two {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        Stack<Integer> nge = new Stack<>();
        int n = nums.length;
        int [] ans = new int [nums.length];
        for(int i = (2*n)-1; i>=0 ;i--){
            while (!nge.isEmpty() && nums[i%n] > nge.peek()) {
                    nge.pop();
            }
            nge.push(nums[i%n]);
            if(i<n){
                while (!nge.isEmpty() && nums[i] >= nge.peek()) {
                    nge.pop();
                }
                if(!nge.isEmpty()){
                    ans[i] = nge.peek();
                    nge.push(nums[i]);
                }
                else{
                    ans[i] = -1;
                    nge.push(nums[i]);
                }
            }
        }
        
        System.out.println(Arrays.toString(ans));

    }
}
