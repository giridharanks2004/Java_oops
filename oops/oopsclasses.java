package oops;
class applicationform{
    private int roll;
    private String name;
    applicationform(String uname, int uroll){
        name=uname;
        roll=uroll;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("roll: "+roll);
    }
}
public class oopsclasses{
    public static void main(String [] args){
        applicationform a = new applicationform("giri", 306);
        a.display();
    }
}
