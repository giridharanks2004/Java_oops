package leetcode;
public class twosortedarray {
    public static int [] merge(int[] a,int[] b){
        int [] c= new int[(a.length+b.length)];
        int i=0;
        int j=0;
        int counter=0;
        while(i<a.length){
            c[counter]=a[i];
            i++;
            counter++;
        }
        while(j<b.length && counter<c.length){
            c[counter]=b[j];
            j++;
            counter++;
        }
        return c;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2={4,5,6};
        int [] arr3=merge(arr1, arr2);
        for(int i=0;i<arr3.length;i++){
            System.err.println(arr3[i]);
        }
    }
}
