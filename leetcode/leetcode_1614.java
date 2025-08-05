package leetcode;

import java.util.Stack;

public class leetcode_1614 {
    public static void main(String [] args){
        String s ="(1+(2*3)+((8)/4))+1";
        Stack<Character> st = new Stack<>();
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }
            else if(s.charAt(i) == ')'){
                st.pop();
            }
            maximum=Math.max(maximum, st.size());
        }
        System.out.println(maximum);

    }
}
