public class cts3 {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int sum=0;
        int n=10;
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
