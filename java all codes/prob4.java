public class prob4 {
    public static void secondlargest(int [] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the second largest element is: "+arr[1]);
    }
    public static void main(String [] args){
        int [] arr=new int[]{1,2,3,4,5};
        secondlargest(arr);
    }
}
