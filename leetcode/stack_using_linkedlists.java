package leetcode;
class LinkStack{
    private int Stk_size=0;
    class node{
        int data;
        node next;
        public node(int val){
            this.data = val;
            this.next = null;
        }
    }
    node top;
    LinkStack(){
        top = null;
    }
    void push(int val){
        node newnode = new node(val);
        newnode.next = top;
        top = newnode;
        Stk_size++;
    }
    int pop(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        node temp = top;
        top = top.next;
        Stk_size--;
        return temp.data;
    }
    int peek(){
        return top.data;
    }
    void display(){
        node temp = top;
        while (temp!=null) {
            if(temp.next != null){
                System.out.print(temp.data+"->");    
            }
            else{
                System.out.println(temp.data+"->NULL");
            }
            temp=temp.next;
        }
    }
    boolean isEmpty(){
        return top == null;
    }
    int Size(){
        return Stk_size;
    }
}
public class stack_using_linkedlists{
    public static void main(String[] args) {
        LinkStack ls = new LinkStack();
        ls.push(10);
        ls.push(20);
        System.out.println(ls.Size());
        ls.display();
        ls.pop();
        ls.display();
    }
}
