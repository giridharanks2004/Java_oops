package patterns;
//daimond
import java.util.*;
public class patterns4 {
    public static void main(String[] args) {
        System.out.println("enter the no.of iterations:");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       inp.close(); 
    }
}
