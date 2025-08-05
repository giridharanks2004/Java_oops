public class cts4 {
    public static int facto(int n){
        if(n==0){
            return 1;
        }
        if(n>0){
            return facto(n-1)*n;
        }
        return 1;   
    }
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+facto(i);
        }
        System.out.println(sum);
    }
}
