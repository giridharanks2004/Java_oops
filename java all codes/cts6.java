// sum of numbers from 1 to n
import java.util.*;
public class cts6 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number from 1 to n:");
        int n=inp.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);
        inp.close();
    }
}
