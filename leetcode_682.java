package leetcode;

import java.util.Stack;

public class leetcode_682 {
    public static void main(String [] args){
        String [] s ={"5","2","C","D","+"};
        Stack<Integer> st = new Stack<>();
        int total = 0;
        for(String ch : s){
            if(ch.equals("+")){
                int t1 = st.pop();
                int t2 = st.peek();
                int sum = t1+t2;
                st.push(t1);
                st.push(sum);
            }
            else if(ch.equals("D")){
                int t1 = st.peek();
                int dval = 2*t1;
                st.push(dval);
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.valueOf(ch));
            }
        }
        while(!st.isEmpty()){
            total+=st.pop();
        }

        System.out.println(total);
    }
}
