package leetcode;

import java.util.Stack;

public class leetcode_20 {
    public static void main(String [] args){
        String s = "[]";
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.isEmpty() || st.peek() != '('){
                    System.out.println(false);
                }
                else{
                    st.pop();
                }
            }
            else if(ch == '}'){
                if(st.isEmpty() || st.peek() != '{'){
                    System.out.println(false);
                }
                else{
                    st.pop();
                }
            }
            else if(ch == ']'){
                if(st.isEmpty() || st.peek() != '['){
                    System.out.println(false);
                }
                else{
                    st.pop();
                }
            }
        }
    }
}
