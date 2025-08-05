package leetcode;
import java.util.HashMap;
public class leetcode_3541{
    public static void main(String[] args) {
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        String s="successes";
        String vowels="aeiouAEIOU";
        for(int i=0;i<vowels.length();i++){
            vow.put(vowels.charAt(i),vow.getOrDefault(vowels.charAt(i),0));
        }
        for(int i=0 ;i<s.length();i++){
            if(vow.containsKey(s.charAt(i))){
                vow.put(s.charAt(i),vow.get(s.charAt(i))+1);
            }
            else{
                cons.put(s.charAt(i),cons.getOrDefault(s.charAt(i),0)+1);
            }
        }
        System.out.println(vow);
        int max_vow_frequency=0;
        int max_cons_frequency=0;
        for(char vow_key : vow.keySet()){
            int val=vow.get(vow_key);
            max_vow_frequency=Math.max(max_vow_frequency,val);
        }
        for(char cons_key : cons.keySet()){
            int val=cons.get(cons_key);
            max_cons_frequency=Math.max(max_cons_frequency, val);
        }
        System.out.println(max_cons_frequency+max_vow_frequency);
    }
    
}