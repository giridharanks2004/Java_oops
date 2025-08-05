

public class maxsubarray {
    public static void main(String[] args) {
        int [] a ={5,9,1,8,7};
        int ans=0;
        //ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int temp=0;
                for(int k=i;k<=j;k++){
                    temp=temp+a[k];
                }
                ans=Math.max(ans, temp);
            }
        }
        System.out.println(ans);
    }
}
