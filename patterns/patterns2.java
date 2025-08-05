package patterns;
//pyramid
import java.util.*;
public class patterns2 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the number of iteratrions:");
        int n=inp.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        inp.close();
    }
}