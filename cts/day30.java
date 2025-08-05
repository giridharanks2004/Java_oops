package cts;

public class day30 {
    public static int calculate(int m, int n){
        int sum=0;
        if(m>=0 && n>=0){
            for(int i=m;i<=n;i++){
                if(i%3==0 && i%5==0){
                    sum+=i;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = calculate(12,50);
        System.out.println(result);
    }
}
