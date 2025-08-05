package leetcode;

import java.util.Stack;

class Student{
    int age;
    String name;
    public Student(String s_name , int s_age){
        this.age = s_age;
        this.name = s_name;
    }
}
public class stack_with_objects {
    public static void main(String [] args){
        Stack<Student> stk = new Stack<>();
        stk.push(new Student("giridharan",20));
        System.out.println(stk.peek().name+"  "+stk.peek().age);
    }
}
