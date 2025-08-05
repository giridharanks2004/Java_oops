package leetcode;

class LinkQueue{
    private int QueueSize = 0;
    class node{
        int data;
        node next;
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    node start;
    node end;
    LinkQueue(){
        start = end = null;
    }
    
    void push(int val){
        node new_node = new node(val);
        if(start == null && end == null){
            start = end = new_node;
        }
        end.next = new_node;
        end = new_node;
        QueueSize = QueueSize + 1;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("queue empty");
            return -1;
        }
        else{
            node temp = start;
            start = start.next;
            QueueSize = QueueSize - 1;
            if(start == null){
                end = null;
            }
            return temp.data;
        }
    }
    void display(){
        node temp = start;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    boolean isEmpty(){
        return start == null && end == null;
    }
}
public class queue_using_linkedlist {
    public static void main(String [] args){
        LinkQueue lq = new LinkQueue();
        lq.push(10);
        lq.push(20);
        lq.display();
        lq.pop();
        lq.display();
        
    }
}
