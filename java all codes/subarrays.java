public class subarrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int size=arr.length;
        for(int start=0;start<size;start++){
            for(int end=start;end<size;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
