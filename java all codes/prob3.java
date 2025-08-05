// check if array is sorted in acsending
public class prob3 {
    public void checksort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("the array is not sorted");
                return;
            }
        }
        System.out.println("the array is sorted!");
    }
    public static void main(String args[]){
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{3,4,1,5,2};
        prob3 a=new prob3();
        a.checksort(arr1);
        a.checksort(arr2);
    }
    
}
