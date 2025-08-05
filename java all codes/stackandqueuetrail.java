import java.util.LinkedList;
import java.util.Queue;

public class stackandqueuetrail {
    public static void main(String [] args){
        String s = "hello";
        //System.out.println(a.reverse()); 
        Queue<String> q = new LinkedList<>();
        q.add(s);
        q.peek();
        System.out.println(q.isEmpty());
        System.out.println(q);
        q.poll();
        System.out.println(q.isEmpty());
        System.out.println(q);

    }
}
