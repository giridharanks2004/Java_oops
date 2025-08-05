public class scoreofstrings {
    static void ScoreofStrings(String a){
        int size=a.length();
        int sum=0;
        for(int i=0;i<size-1;i++){
            int num1=a.charAt(i);
            int num2=a.charAt(i+1);
            int subs=Math.abs(num1-num2);
            sum=sum+subs;
        }
        System.out.println(sum);
    }
    public static void main(String [] args){
        ScoreofStrings("hello");
    }
}
