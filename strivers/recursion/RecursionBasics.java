import java.util.Arrays;

public class RecursionBasics {
    public static void printNtimes(int n){
        if(n<1){
            return;
        }
        String msg = "Hello World";
        System.out.println(msg);
        printNtimes(n-1);
    }
    public static void printOneToN(int n){
        if(n<1){
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
    public static void printNtoOne(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
    }
    public static int SumofN(int n){
        if(n==1){
            return n;
        }
        int sum = SumofN(n-1)+n;
        return sum;
    }
    public static int FactN(int n){
        if(n==1){
            return n;
        }  
        int fact = FactN(n-1);
        return fact * n;
    }
    public static void RevArr(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        RevArr(arr, l+1, r-1);
    }
    public static boolean IsPalindrome(String s, int start, int end){
        if(start >= end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return IsPalindrome(s, start+1, end-1);
    }
    public static int Fibs(int [] fibcache,int n){
        if(n<=1){
            return n;
        }
        if(fibcache[n] != 0){
            return fibcache[n];
        }
        int num = Fibs(fibcache, n-2)+Fibs(fibcache, n-1);
        fibcache[n] = num;
        return num;
    
    }
    public static void main(String[] args) {
        //printOneToN(4);
        //printNtoOne(4);
        //System.out.println(SumofN(3));
        //System.out.println(FactN(3));
        //int [] arr = {3,2,1};
        //RevArr(arr, 0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
       //String a = "leel";
        //System.out.println(IsPalindrome(a, 0, a.length()-1));
        int [] fibcache = new int[50];
        System.out.println(Fibs(fibcache, 5));
    }

}
