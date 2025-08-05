import java.util.*;
/*Two strings are isomorphic if characters in the first string can be consistently replaced to get the second string.
Each character must map to one unique character, and the structure/order must be preserved.*/
public class p18_isomorphicstrings {
    public static void main(String[] args) {
        boolean ans=true;
        String s="egg";
        String t="add";
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> rev=new HashMap<>();
        if(s.length()!=t.length()){
            ans=false;
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!map1.containsKey(ch1) && !rev.containsKey(ch2)){
                map1.put(ch1,ch2);
                rev.put(ch2,ch1);
            }
            else if(map1.containsKey(ch1) && map1.get(ch1)!=ch2){
                ans=false;
            }
            else if(rev.containsKey(ch2) && rev.get(ch2)!=ch1){
                ans=false;
            }
        }
        System.out.println(ans);
    }
}
