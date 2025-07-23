package leetcode;
/*1876. Substrings of Size Three with Distinct Characters
A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.*/
import java.util.HashMap;
public class leetcode_1876_optimised{
    public static void main(String[] args) {
        HashMap <Character,Integer> hm=new HashMap<>();
        String a="xyzzaz";
        int l=0;
        int count=0;
        for(int r=0;r<a.length();r++){
            char ch=a.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(r-l==3){
                char lch=a.charAt(l);
                hm.put(lch,hm.get(lch)-1);
                if(hm.get(lch)==0){
                    hm.remove(lch);
                }
                l++;
            }
            if(hm.size()==3){
                count++;
            } 
        }
        System.out.println(count);
    }
}