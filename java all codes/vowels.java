import java.util.*;
public class vowels {
    public static void main(String[] args) {
        HashSet<Character> vow=new HashSet<>();
        String v="aeiouAEIOU";
        for(int i=0;i<v.length();i++){
            vow.add(v.charAt(i));
        }
        System.out.println(vow);
        int n=0;
        String a="giridharan";
        for(int i=0;i<a.length();i++){
            if(vow.contains(a.charAt(i))){
                n++;
            }
        }
        System.err.println(n);
    }
}
