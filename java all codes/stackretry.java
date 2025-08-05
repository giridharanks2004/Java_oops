public class stackretry {
    static int max=5;
    static int [] arr = new int[max];
    static int top=-1;
    static void push(int val){
        if(top==max-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top]=val;
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.err.println("number popped is: "+arr[top]);
            top--;
        }
    }
    static void display(){
        if(top==-1){
            System.out.println("stack empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.err.println();
    }
    public static void main(String[] args) {
        push(10);
        display();
        push(20);
        display();
        push(30);
        display();
        pop();
        display();
        pop();
        display();
        pop();
        display();
        
    }
}
