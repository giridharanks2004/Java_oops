package leetcode;

public class linkedlist<T>{
    class node{
        T data;
        node next;
        node(T val){
            data=val;
            next=null;
        }
    }
    node head;
    linkedlist(){
        head=null;
    }
    public void insertatbeg(T val){
        node newnode = new node(val);
        if(head==null)
            head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void display(){
        if(head==null){
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertatend(T val){
        if(head==null){
            insertatbeg(val);
            return;
        }
        node newnode = new node(val);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void insertatpos(T val,int pos){
        if(pos==0){
            insertatbeg(val);
            return;
        }
        node newnode = new node(val);
        node temp = head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public void searchval(T val){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==val){
                System.out.println("value "+val+" found at "+ i);
                return;
            }
            i++;
            temp=temp.next;
        }
        System.out.println("value is not found in the linked list");
        return;
    }

    public void delatpos(int pos){
        node temp=head;
        node prev=null;
        if(head==null){
            throw new IndexOutOfBoundsException("the linked list is empty");
        }
        if(pos==0){
            delatbeg();
            return;
        }
        for(int i=0;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.
        next;
    }
    
    public void delatbeg(){
        if(head==null){
            throw new ArrayIndexOutOfBoundsException("the linked list is empty");
        }
        head=head.next;
    }

    public boolean contains(T val){
        node temp=head;
        while (temp!=null) {
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    
}