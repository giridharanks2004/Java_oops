package leetcode;
import java.util.*;
public class leecode_438 {
    public static boolean check_anagram(HashMap <Character,Integer> a, HashMap<Character,Integer> b ){
        if(a.size() != b.size()){
            return false;
        }
        for(char key : a.keySet()){
            if(!b.containsKey(key)){
                return false;
            }
            int freq1=a.get(key);
            int freq2=b.get(key);
            if(freq1 != freq2){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String s="cbaebabacd";
        String p="abc";
        HashMap<Character,Integer> s_map = new HashMap<>();
        HashMap<Character,Integer> p_map = new HashMap<>();
        List<Integer> ls =  new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            p_map.put(ch,p_map.getOrDefault(ch,0)+1);
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            char rch = s.charAt(r);
            s_map.put(rch,s_map.getOrDefault(rch,0)+1);

            if(r-l==p.length()){
                char lch = s.charAt(l);
                s_map.put(lch,s_map.get(lch)-1);
                if(s_map.get(lch)==0){
                    s_map.remove(lch);
                }
                l++;
            }

            if(r-l+1==p.length()){
                if(check_anagram(s_map, p_map)){
                    ls.add(l);
                }
            }
        }
        System.out.println(ls);

    }
}
