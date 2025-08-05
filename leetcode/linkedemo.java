package leetcode;

public class linkedemo {
    public static void main(String[] args) {
        linkedlist<Integer> list1=new linkedlist<>();
        list1.insertatbeg(10);
        list1.insertatbeg(9);
        list1.insertatend(15);
        System.out.println(list1.contains(0));
    }
}
