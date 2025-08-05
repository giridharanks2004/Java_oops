//bubble sort
public class bubblesort {
    public static void main(String [] args){
        int[] arr1=new int[]{1,5,3,8,9,10,2};
        int size=arr1.length;
        int temp=0;
        System.out.println("before sorting:");
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr1[j]<arr1[j+1]){
                    temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }
    }
}
