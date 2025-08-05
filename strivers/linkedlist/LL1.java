package strivers.linkedlist;

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
    public static Node InsertBeforeval(Node head,int val,int before){
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
    public static Node ReverseLL(Node head){
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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node converted = ConvertToLL(arr);
        //System.out.println("count: "+ListLength(converted));
        //System.out.println(isfound(converted, 10));
        //Display(converted);
        //converted = DeleteAt(converted, 1);
        //converted = deleteByVal(converted, 0);
        //converted=InsertatBeg(converted, 10);
        converted = ReverseLL(converted);
        Display(converted);
        //converted=InsertBeforeval(converted, 10, 2);
        //Display(converted);

    }
}
