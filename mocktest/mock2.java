package mocktest;

import java.util.HashSet;

public class mock2 {
    public static boolean isnonrepeating(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length();i++){
            hs.add(s.charAt(i));
        }
        if(hs.size()==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "aaa";
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<s.length();i++){
            for(int j=i;j<s.length()-1;j++){
                if(isnonrepeating(s.substring(i, j+1))){
                    maximum=Math.max(maximum, j-i+1);
                }
            }
        }
        System.out.println(maximum);
    }
}
