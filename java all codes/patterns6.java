import java.util.*;
public class patterns6 {
    public static void main(String [] args){
        Scanner inp= new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n || j==i || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        inp.close();
    }
}
