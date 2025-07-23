package leetcode;

import java.util.Stack;

class Cricketer{
    String c_name;
    int c_runs;
    String c_nickname;
    public Cricketer(String name, int runs, String nickname){
        this.c_name = name;
        this.c_runs = runs;
        this.c_nickname = nickname;
    }
}
public class Stack_with_objects_trail {
    public static void main(String[] args) {
        String name[] = {"Vignesh", "Dinesh", "Arjun", "Pavan"};
        int runs[] = {0, 100, 45, 10};
        String nickName[] = {"Boom", "Bam", "Vim", "Vum"};

        Stack<Cricketer> stk = new Stack<>();
        if(name.length == nickName.length && name.length == runs.length){
            for(int i = 0; i<name.length; i++){
                stk.push(new Cricketer(name[i],runs[i],nickName[i]));
            }
        }
        for(Cricketer i : stk){
            System.out.println("Cricketer's name: "+ i.c_name);
            System.out.println("Cricketer's nickname: "+ i.c_nickname);
            System.out.println("Cricketer's runs:"+ i.c_runs);
            System.out.println();
        }
    }
}
