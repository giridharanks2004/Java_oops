import java.util.Stack;

public class Stack_reverse_String {
    public static void main(String[] args) {
        String s = "giridharanks";
        Stack<Character> arr = new Stack<>();
        for(int i=0;i<s.length();i++){
            arr.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (!arr.isEmpty()) {
            result.append(arr.pop());
        }
        System.out.println(result.toString());
    }
}
