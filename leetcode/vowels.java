package leetcode;

import java.util.HashSet;

public class vowels {
    public static void main(String[] args) {
        String vow="aeiouAEIOU";
        String a="apple";
        StringBuilder result=new StringBuilder();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<vow.length();i++){
            hs.add(vow.charAt(i));
        }
        for(int i=0;i<a.length();i++){
            if(hs.contains(a.charAt(i))){
                result.append(' ');
            }
            else{
                result.append(a.charAt(i));
            }
        }
        System.out.println(result);
    }
}
