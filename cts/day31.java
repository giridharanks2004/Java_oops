package cts;

import java.util.Scanner;
public class day31 {
    public static void num_to_words(int num){
        String [] ones = {"","one","two","three","four","five","six","seven","eight","nine"};
        String [] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        StringBuilder result = new StringBuilder();
        if(num>=1000){
            result.append(ones[num/1000]);
            result.append(" thousand ");
            num=num%1000;
        }
        if(num>=100){
            result.append(ones[num/100]);
            result.append(" hundred ");
            num=num%100;
        }
        if(num<10){
            result.append(ones[num]);
        }
        if(num>=10 && num<20){
            result.append(teens[num % 10]);
        }
        if(num>=20 && num <100){
            result.append(tens[num/10]+" ");
            num=num%10;
             if(num>0 && num<10){
                result.append(ones[num]);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int a=-1;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number (1 to 10,000) : ");
        while (a!=0) {
            a=inp.nextInt();
            num_to_words(a);
        }
        System.out.println("exit from loop since input was 0");
        inp.close();
    }       
}
