//. Sum of cubes of all integers from 1 to N
public class cts1 {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            int cube=(int)Math.pow(i,3);
            sum=sum+cube;
        }
        System.out.println("sum of cubes between 1 to N: "+sum);
    }
}
