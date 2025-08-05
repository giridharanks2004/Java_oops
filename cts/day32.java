package cts;

public class day32 {
    public static void main(String [] args){
        String s1="abcdef";
        String s2="cefz";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(s2.indexOf(ch)==-1){
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

