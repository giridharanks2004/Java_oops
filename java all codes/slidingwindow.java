public class slidingwindow {
    public static void main(String[] args) {
        int [] arr={1,10,20,30,50};
        int sum=0;
        int size=3;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
            
        }
        int max=sum;
        System.out.println(sum);
        for(int i=size;i<arr.length;i++){
            sum=arr[i]+sum-arr[i-size];
            System.out.println(sum);
            max=Math.max(max,sum);
        }
        System.out.println(max);
        
    }
}
