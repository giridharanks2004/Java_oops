package cts;

import java.util.HashSet;

public class day45 {
    public static void main(String[] args) {
        String a = "darkchocolate";
        StringBuilder s1 = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0 ; i<a.length(); i++){
            if(!hs.contains(a.charAt(i))){
                s1.append(a.charAt(i));
            }
            hs.add(a.charAt(i));
        }
        System.out.println(s1);
    }
}
