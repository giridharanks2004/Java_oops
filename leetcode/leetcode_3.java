package leetcode;
import java.util.*;
public class leetcode_3 {
    public static void main(String[] args){
        String s1="pwwkew";
        int l=0;
        int ans=0;
        HashSet<Character> hs = new HashSet<>();
        for(int r=0;r<s1.length();r++){
            char ch=s1.charAt(r);
            while(hs.contains(ch)){
                hs.remove(s1.charAt(l));
                l++;
            }
            hs.add(ch);
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);    
    }
}

