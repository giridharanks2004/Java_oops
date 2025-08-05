public class findminum {

    public static void minimum(int a,int b,int c){
        if(a<b && a<c){
            System.out.println(a);
        }
        else if(b<a && b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
    public static void  main(String [] args){
        int a = 5;
        int b = 20;
        int c = 3;
        minimum(a, b, c);
    }
}
