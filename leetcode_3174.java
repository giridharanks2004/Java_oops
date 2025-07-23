package leetcode;

import java.util.Stack;

public class leetcode_3174 {
    public static void main(String[] args) {
        String s = "cb4a";
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.size()==0){
            System.out.println(str.toString());
        }
        else{
            while(!st.isEmpty()){
                str.append(st.pop());
            }
            System.out.println(str.reverse().toString());
        }
        
    }
}
