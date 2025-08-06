package strivers.linkedlist;

import java.util.HashMap;

public class LL1 {
     static class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        } 
    }

    public static Node ConvertToLL(int [] arr){ //convert an array to LL
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i<arr.length ; i++){
            Node new_node = new Node(arr[i]);
            temp.next = new_node;
            temp = new_node;
        }
        return head;
    }
    public static void Display(Node head){  // display all elements in an LL
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
    public static Node DeleteAt(Node head,int k){ // delete at specific position
        if(head == null){
            return head;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        for(int i = 1 ; i <k ; i++){
            prev = temp;
            temp=temp.next;
            if(temp==null){
                return head;
            }
        }
        prev.next = temp.next;
        return head;
    }
    public static int ListLength(Node head){ // return lenght of the linked list
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static boolean isfound(Node head, int val){ // return the presence of a value
        Node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static Node deleteByVal(Node head,int val){ // delete by val if present in linked list
        if(head.data==val){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==val){
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node InsertatBeg(Node head,int val){ //insert at beginning 
        Node new_Node = new Node(val);
        new_Node.next=head;
        head=new_Node;
        return head;
    }
    public static Node InsertAtpos(Node head,int val,int pos){ //insert at a specified position
        if(head==null || pos == 1){
            return InsertatBeg(head, val);
        }
        Node new_Node = new Node(val);
        Node temp = head;
        Node prev = null;
        for(int i = 1 ; i<pos ; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next=new_Node;
        new_Node.next=temp;
        return head;
    }
    public static Node InsertBeforeval(Node head,int val,int before){ // insert before val
        if(head.data == before){
            return InsertatBeg(head, val);
        }
        Node new_Node = new Node(val);
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data == before){
                prev.next=new_Node;
                new_Node.next=temp;
                return head;
            }
            prev = temp;
            temp=temp.next;
        }

        return head;
    }
    public static Node ReverseLL(Node head){ // reverse iterative 
        if(head == null) return head;
        Node curr = head;
        Node prev = null;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public static Node reverseLLRecr(Node head){ // reverse using recursion 
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseLLRecr(head.next);
        head.next.next=head;
        head.next = null;
        return newHead;
    }
    public static boolean isLoop(Node head){ // detect the cycle in linked list
        Node slow , fast;
        slow = fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static Node createCustomList() {
    // Create all nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n15 = new Node(15);
        Node n9 = new Node(9);
        Node n4 = new Node(4);
        Node n13 = new Node(13);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        // Link them as per the image
        n1.next = n2;
        n2.next = n15;
        n15.next = n9;
        n9.next = n4;
        n4.next = n13;
        n13.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9; // Creates the cycle

        return n1; // head of the list
    }

    public static int lenOfLoop(Node head){
        HashMap<Node,Integer> hm = new HashMap<>();
        int count = 1;
        Node temp = head;
        while (temp!=null) {
            
            if(!hm.containsKey(temp)){
                hm.put(temp, count);
            }else{
                return count - hm.get(temp);
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }

    public static int lenOfLoopFast(Node head){
        Node fast,slow;
        fast = slow = head;
        int count = 0;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                count++;
                fast = fast.next;
                while (fast!=slow) {
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node converted = ConvertToLL(arr);
        //System.out.println("count: "+ListLength(converted));
        //System.out.println(isfound(converted, 10));
        //Display(converted);
        //converted = DeleteAt(converted, 1);
        //converted = deleteByVal(converted, 0);
        //converted=InsertatBeg(converted, 10);
        //Node a = new Node(10);
        //Node b = new Node(20);
        //a.next = b;
        //b.next = a;
        //System.out.println(isLoop(a));
        //converted = reverseLLRecr(converted);
        //Display(converted);
        //System.out.println(isLoop(converted));
        Node cyclelist = createCustomList();
        System.out.println(lenOfLoopFast(cyclelist));
        //converted=InsertBeforeval(converted, 10, 2);
        //Display(converted);

    }
}
