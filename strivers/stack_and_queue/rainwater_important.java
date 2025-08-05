public class rainwater_important {
    public static void main(String[] args) {
        int [] hieght = {0,1,0,2,1,0,1,3,2,1,2,1};
        int lmax,rmax,total;
        lmax = rmax = total = 0;
        int l=0;
        int r=hieght.length-1;
        while (l<r) {
            if(hieght[l]<=hieght[r]){
                if(lmax>hieght[l]){
                    total=total+(lmax-hieght[l]);
                }
                else{
                    lmax=hieght[l];
                }
                l++;
            }
            else{
                if(rmax>hieght[r]){
                    total=total+(rmax-hieght[r]);
                }
                else{
                    rmax=hieght[r];
                }
                r--;
            }
        }

        System.out.println(total);

    }
}
