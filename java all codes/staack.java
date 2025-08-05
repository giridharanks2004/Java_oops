public class staack<T>{
    int top=-1;
    int max=5;
    int[] arr=new int[max];

    public void push(int a){
        if(top == max-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top]=a;
        }
        
    }
    public void pop(){
        System.out.println("item poped: "+arr[top]+"");
        top--;
    }
    public void display(){
        System.out.println("displaying stack:");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
            staack<Integer> stack=new staack<Integer>();
            stack.push(10);
            stack.push(20);
            stack.display();
        }
}
