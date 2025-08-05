import java.util.Stack;
public class minstack {
    Stack<Integer> stk;
    Stack<Integer> ministk;
    int minimum = Integer.MAX_VALUE;
    minstack(){
        stk = new Stack<>();
        ministk = new Stack<>();
    }
    void push(int val){
        if(ministk.isEmpty() || val<minimum){
            minimum = val;
            ministk.push(minimum);
        }
        stk.push(val);
    }
    int pop(){
        if(empty()){
            return -1;
        }
        int temp = stk.pop();
        if(temp == minimum && temp == ministk.peek()){
            ministk.pop();
        }
        return temp;
    }
    boolean empty(){
        return stk.isEmpty();
    }
    int getMin(){
        return ministk.peek();
    }
    public static void main(String[] args) {
        minstack mi = new minstack();
        mi.push(10);
        mi.push(20);
        mi.push(3);
        System.out.println(mi.getMin());
        mi.pop();
        System.out.println(mi.getMin());
    }
}
