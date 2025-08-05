package patterns;
//number patterns
import java.util.*;
public class patterns5 {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print(p +"  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1,p=1;j<=i;j++,p++){
                System.out.print(p +"  ");
            }
            System.out.println();
        }
        inp.close();
    }
    
}
