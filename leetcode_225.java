package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_225 {
        Queue<Integer> q;
    public leetcode_225(){
        q = new LinkedList<>();
    }
    public void push(int val){
        q.add(val);
        for(int i=1 ; i<q.size() ; i++){
            int temp = q.poll();
            q.add(temp);
        }
    }
    public int pop(){
        return q.poll();
    }
    public int top(){
        return q.peek();
    }
    public boolean isempty(){
        return q.isEmpty();
    }
    public void display(){
        System.out.println(q);
    }
    public static void main(String[] args) {
        leetcode_225 stk = new leetcode_225();
        stk.push(1);
        stk.push(3);
        stk.display();
        System.out.println(stk.pop());
        stk.display();
    }
}