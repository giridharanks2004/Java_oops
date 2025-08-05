package strivers.linkedlist;

import java.util.Stack;

public class DLL1 {
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.prev = null;
            this.next = null;                                                                              
        }
    }
    public static Node toDLL(int [] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i<arr.length ; i++){
            Node newnode = new Node(arr[i]);
            temp.next=newnode;
            newnode.prev = temp;
            temp = newnode;
        }
        return head;
    }
    public static Node InsertatBeg(Node head , int val){
        Node newnode = new Node(val);
        newnode.next=head;
        head.prev=newnode;
        head = newnode;
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
    public static Node DeleteAtbeg(Node head){
        if(head == null){
            return head;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    public static Node DeleteAtEnd(Node head){
        Node temp = head;
        if(head == null){
            return head;
        }
        if(head.next == null){
            head = null;
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        Node previous = temp.prev;
        temp.prev = null;
        previous.next = null;
        return head;
    }
    public static Node DeleteAtK(Node head , int k){
        if(head == null){
            return head;
        }
        if(k==1){
            return DeleteAtbeg(head);
        }
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            count ++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
         if(temp == null){
            return head;
        }
        if(temp.next == null){
            temp.prev.next = null;
            temp.prev = null;
            return head;
        }
        temp.prev.next= temp.next;
        temp.next.prev= temp.prev;
        temp.next = null;
        temp.prev = null;
        return head;
    }
    public static void DeleteNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;

    }
    public static Node InsertatEnd(Node head,int val){
        Node newnNode = new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        newnNode.prev = temp;
        temp.next = newnNode;
        return head;

    }
    public static Node InsertatK(Node head,int val,int k){
        Node newnNode = new Node(val);
        if(k==1){
            return InsertatBeg(head,val);
        }
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            count++;
            if (count==k) {
                break;
            }
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        if (temp.next == null) {
            newnNode.prev = temp.prev;
            temp.prev.next = newnNode;
            newnNode.next = temp;
            temp.prev = newnNode;
            return head;
        }
        newnNode.next = temp;
        newnNode.prev = temp.prev;
        temp.prev.next = newnNode;
        temp.prev = newnNode;
        return head;
    }
    public static Node InsertBeforeval( Node head , int val , int before){
        Node newnode = new Node(val);
        Node curr = head;
        if(head.data == before){
            return InsertatBeg(head, val);
        }
        while (curr != null) {
            if(curr.data == before){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        newnode.prev = curr.prev;
        newnode.next = curr;
        curr.prev.next = newnode;
        curr.prev = newnode;
        return head;
    }
    public static Node ReverseDLL(Node head){
        if(head ==  null) return head;
        Stack<Integer> stk = new Stack<>();
        Node temp = head;
        while (temp!=null) {
            stk.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            temp.data = stk.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node converted = toDLL(arr);
        //converted = InsertatBeg(converted, 10);
        //System.out.println(converted.next.data);
        Node temp = converted;
        temp = temp.next;
        //System.out.println(temp.prev.data);
        //converted = DeleteAtbeg(converted);
        //converted = DeleteAtK(converted,5);
        //DeleteNode(converted.next);
        //converted = InsertatEnd(converted, 10);
        //converted = InsertBeforeval(converted, 10, 1);
        converted = ReverseDLL(converted);
        Display(converted);
    }
}
