//3. Sum of product of integers (1*2 + 2*3 + 3*4 + ...)
public class cts2 {
    public static void main(String[] args) {
        int sum=0;
        int prod=1;
        int n=10;
        for(int i=1;i<=n;i++){
            prod=prod*i;
            sum=sum+prod;
        }
        System.out.println(sum);
    }
}
