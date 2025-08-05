public class maximum {
    public static void main(String [] args){
        int [] arr=new int[]{1,5,6,18,50,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
