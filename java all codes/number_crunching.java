import java.util.Scanner;
public class number_crunching {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=inp.nextInt();
        int sum=0;
        while(number>0){
            sum=sum+(number%10);
            number=number/10;
        }
        System.out.println(sum);
        inp.close();

    }
}
