
public class cts7 {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=7;
        int b=10;
        int [] arr={a,b};
        for(int num : arr){
            if(isprime(num)){
                System.out.println("it's prime!");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
}
