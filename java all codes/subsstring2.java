// finding the longest substring with nonrepeating characters

import java.util.HashSet;

public class subsstring2 {
    public static boolean isnonrepeating(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0 ; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        if(hs.size()==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "abcdeaadaabaadbbcaadd";
        int maxlen = Integer.MIN_VALUE;
        for(int i=0;i<a.length();i++){
            for(int j=i; j<a.length()-1; j++){
                if(isnonrepeating(a.substring(i,j+1))){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        System.out.println(maxlen);
    }
}
