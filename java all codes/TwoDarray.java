import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Scanner inp= new Scanner(System.in);
        int row=arr.length;
        int col=arr[0].length;
        int sum=0;
        System.out.println("enter the array elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("diagonal elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    System.err.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.err.println();
        }
        System.out.println("reverse diagonal elements");
        for(int i=0;i<row;){
            for(int j=col-1;j>=0;j--){
                System.err.print(arr[i][j]+" ");
            }
            System.out.println();
            break;
        }
        System.out.print("sum of daigonal elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.err.println(sum);
        inp.close();
    }

}
