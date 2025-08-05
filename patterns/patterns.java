package patterns;
public class patterns {
    static void simple(char a,int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
    static void itriangle(char a,int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
    static void dtriangle(char a,int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(a+"  ");
                
            }
            System.out.println();
        }
    }
    static void right(char a, int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
    static void rinverse(char a, int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        char a='*';
        int n=4;
        simple(a,n);
        System.out.println();
        itriangle(a, n);
        System.out.println();
        dtriangle(a, n);
        System.out.println();
        right(a, n);
        System.out.println();
        rinverse(a, n);
    }

}


