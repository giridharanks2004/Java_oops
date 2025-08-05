import java.util.*;
public class subaarrys {
    public static void main(String[] args) {
        String a ="marvel";
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                String temp=a.substring(i, j+1);
                arr.add(temp);
            }
        }
        System.out.println(arr);
    }
}
