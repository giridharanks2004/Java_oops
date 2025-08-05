package cts;

import java.util.HashMap;
public class day35 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        String input=new String("aaaBBBccc");
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char key : hm.keySet()){
            System.out.println(key+" : "+hm.get(key));
        }
    }
}