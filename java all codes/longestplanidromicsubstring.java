public class longestplanidromicsubstring{
    public static boolean ispalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<s.length() && r>=0){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "abracadabra";
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<a.length();i++){
            for(int j=i ;j<a.length()-1;j++){
                if(ispalindrome(a.substring(i, j+1))){
                    String sub = a.substring(i,j+1);
                    maximum = Math.max(maximum,sub.length());
                }
            }
        }
        System.out.println(maximum);
    }
}
