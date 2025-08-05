package leetcode;

import java.util.Stack;

public class queue_using_stack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    queue_using_stack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int val){
        if(empty()){
            s1.push(val);
        }
        else{
            while (!s1.empty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(val);
            while (!s2.empty()) {
                s1.push(s2.peek());
                s2.pop();
            }
        }
    }
    public int pop(){
        return s1.pop();
    }

    public boolean empty(){
        return s1.isEmpty();
    }
    public void display(){
        for(int i : s1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue_using_stack q = new queue_using_stack();
        q.push(10);
        q.push(20);
        q.push(30);
        q.display();
        q.pop();
        q.display();

    }
}
