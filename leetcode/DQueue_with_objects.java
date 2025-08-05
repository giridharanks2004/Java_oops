package leetcode;

import java.util.Deque;
import java.util.LinkedList;

class Members{
    String name;
    int runs;
    public Members(String c_name, int c_runs){
        this.name = c_name;
        this.runs = c_runs;
    }
}
public class DQueue_with_objects {
    public static void main(String [] args){
        String name[] = {"Vignesh", "Dinesh", "Arjun", "Pavan"};
        int runs[] = {0, 100, 45, 10};
        Deque<Members> dq = new LinkedList<>();
        if(name.length == runs.length){
            for(int i = 0 ; i<name.length ; i++){
                dq.addFirst(new Members(name[i],runs[i]));
            }
        }
        for(int i=0; i<=dq.size() ; i++){
            if(i%2 != 0){
                Members temp = dq.peekFirst();
                System.out.println(temp.name+" "+temp.runs);
            }
            else{
                Members temp = dq.peekLast();
                System.out.println(temp.name+" "+temp.runs);
            }
        }

    }
}
