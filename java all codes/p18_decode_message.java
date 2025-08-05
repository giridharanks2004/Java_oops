import java.util.*;
public class p18_decode_message{
    public static void main(String[] args) {
        HashMap<Character,Character> map1=new HashMap<>();
        String key="the quick brown fox jumps over the lazy dog";
        int temp=97;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' '){
                map1.put(key.charAt(i),' ');
            }
            if(map1.containsKey(key.charAt(i))){
                map1.put(key.charAt(i),map1.get(key.charAt(i)));
            }
            else{
                map1.put(key.charAt(i),(char)temp);
                temp=temp+1;
            }
        }
        String message="vkbs bs t suepuv";
        String decoded="";
        for(int i=0;i<message.length();i++){
            if(map1.containsKey(message.charAt(i))){
                decoded=decoded+map1.get(message.charAt(i));
            }
        }
        System.out.print(decoded);
        
    }
    
}
