public class stocks {
    static void sell(int [] arr){
        int size=arr.length;
        int min=arr[0];
        int diff;
        int profit=0;
        for(int i=1;i<size;i++){
            diff=arr[i]-min;
            profit=Math.max(profit,diff);
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.err.println("profit:"+profit);
    }   
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        sell(arr);
    }
}
