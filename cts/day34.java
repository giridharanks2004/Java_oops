package cts;

public class day34 {
    public static void main(String[] args) {
        String a = "take u forward is awesome";
        StringBuilder result = new StringBuilder();
        String [] words = a.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                if(j==0 || j==word.length()-1){
                    char ch = word.charAt(j);
                    result.append(Character.toUpperCase(ch));
                }
                else{
                    result.append(word.charAt(j));
                }
            }
            result.append(" ");
        }
        System.out.println(result);

    }
}
