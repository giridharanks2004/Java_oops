package mocktest;

import java.util.HashMap;

public class mock1 {
    public static void main(String[] args) {
        String s ="geeksforgeeks";
        boolean found = false;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0;i<s.length(); i++){
            if(hm.get(s.charAt(i))==1){
                found = true;
                System.out.println("'"+s.charAt(i)+"' is the first non repeating character");
                break;
            }
        }

        if(!found){
            System.out.println("$");
        }
    }
}
