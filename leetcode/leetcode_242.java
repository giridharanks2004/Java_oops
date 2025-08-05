package leetcode;
import java.util.HashMap;
public class leetcode_242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean valid=true;
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> s2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            s2.put(t.charAt(i),s2.getOrDefault(t.charAt(i), 0)+1);
        }
        for(char key:s1.keySet()){
            if(!s2.containsKey(key)){
                valid=false;
                break;
            }
            int a=s1.get(key);
            int b=s2.get(key);
            if(a!=b){
                valid=false;
                break;
            }
        }
        if(valid){
            System.out.println(valid);
        }
        else{
            System.out.println(valid);
        }
    }

    
}