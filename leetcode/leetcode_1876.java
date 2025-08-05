package leetcode;
/*1876. Substrings of Size Three with Distinct Characters
A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.*/
import java.util.HashSet;
public class leetcode_1876 {
    public static boolean isgood(String s){
        HashSet <Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hset.contains(s.charAt(i))){
                hset.add(s.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="xyzzaz";
        int size=a.length();
        int count=0;
        int sl=2;
        for(int i=0;i<size-sl+1;i++){
            int j=i+sl-1;
            if(isgood(a.substring(i,j+1))){
                count++;
            }

        }
        System.out.println(count);
    }
}
